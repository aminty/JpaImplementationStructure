package base.repository;

import base.entity.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<E extends BaseEntity<ID>,ID extends Serializable> {

    E saveOrUpdate(E e);

    E save(E e) ;

    E update(E e);

    void delete(E e);

    E findById(ID id);

    List<E> findAll();

    boolean isExistsById(ID id);

    Long countAll();


    EntityManager getEntityManager();
}

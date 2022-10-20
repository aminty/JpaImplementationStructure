package base.service;

import base.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity<ID>,ID extends Serializable> {
    E save(E e) ;

    E update(E e);

    void delete(E e);

    E findById(ID id);

    List<E> findAll();

    boolean isExistsById(ID id);

    Long countAll();
}

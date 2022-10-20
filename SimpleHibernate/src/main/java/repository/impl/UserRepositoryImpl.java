package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import entity.User;
import jakarta.persistence.EntityManager;
import repository.UserRepository;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Long> implements UserRepository {

    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User findUserByUsername(String username) {
        return getEntityManager().createQuery("from "+getEntityClass().getSimpleName()+" where username= :uname",getEntityClass())
                .setParameter("uname",username).getSingleResult();
    }
}

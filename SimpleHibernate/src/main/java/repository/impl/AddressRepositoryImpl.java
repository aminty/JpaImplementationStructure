package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import entity.Address;
import jakarta.persistence.EntityManager;
import repository.AddressRepository;

public class AddressRepositoryImpl extends BaseRepositoryImpl<Address,Long> implements AddressRepository {
    public AddressRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Address> getEntityClass() {
        return Address.class;
    }
}

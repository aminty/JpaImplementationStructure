package service.impl;

import base.service.impl.BaseServiceImpl;
import entity.Address;
import entity.User;
import repository.AddressRepository;
import repository.UserRepository;
import service.AddressService;
import service.UserService;

public class AddressServiceImpl extends BaseServiceImpl<Address,Long, AddressRepository> implements AddressService {
    public AddressServiceImpl(AddressRepository repository) {
        super(repository);
    }
}

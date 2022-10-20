package util;

import entity.User;
import entity.dto.SimpleUser;
import jakarta.persistence.EntityManager;
import repository.AddressRepository;
import repository.UserRepository;
import repository.impl.AddressRepositoryImpl;
import repository.impl.UserRepositoryImpl;
import service.AddressService;
import service.UserService;
import service.impl.AddressServiceImpl;
import service.impl.UserServiceImpl;
import service.mapper.DtoMapper;
import service.mapper.DtoMapperImpl;

public class ApplicationContext {



    private static  UserRepository userRepository;
    private static UserService userService;

    private static DtoMapper dtoMapper;

    private static AddressRepository addressRepository;
    private static AddressService addressService;

    private ApplicationContext(){

    }

    static {
        EntityManager entityManager = HibernateUtils.getEntityManagerFactory().createEntityManager();
        dtoMapper=new DtoMapperImpl();
        userRepository=new UserRepositoryImpl(entityManager);
        userService=new UserServiceImpl(userRepository,dtoMapper);


        addressRepository=new AddressRepositoryImpl(entityManager);
        addressService=new AddressServiceImpl(addressRepository);

    }

    public static UserService getUserService() {
        return userService;
    }

    public static AddressService getAddressService() {
        return addressService;
    }
}

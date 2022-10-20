package service.impl;

import base.service.impl.BaseServiceImpl;
import entity.User;
import entity.dto.SimpleUser;
import repository.UserRepository;
import service.UserService;
import service.mapper.DtoMapper;

public class UserServiceImpl extends BaseServiceImpl<User,Long, UserRepository> implements UserService {

    public DtoMapper dtoMapper;
    public UserServiceImpl(UserRepository repository,DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper=dtoMapper;
    }

    @Override
    public SimpleUser findUserByUsername(String username) {
        return dtoMapper.userDtoMapper(repository.findUserByUsername(username));
    }
}

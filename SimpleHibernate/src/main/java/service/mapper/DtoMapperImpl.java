package service.mapper;

import entity.User;
import entity.dto.SimpleUser;

public class DtoMapperImpl implements DtoMapper{
    @Override
    public SimpleUser userDtoMapper(User user) {
        if (user ==null){
            return null;
        }
        SimpleUser simpleUser=new SimpleUser();
        simpleUser.setFirstname(user.getFirstname());
        simpleUser.setLastname(user.getLastname());
        simpleUser.setUsername(user.getUsername());

        return simpleUser;
    }
}

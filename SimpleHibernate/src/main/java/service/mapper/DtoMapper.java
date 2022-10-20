package service.mapper;

import entity.User;
import entity.dto.SimpleUser;
import org.mapstruct.Mapper;

public interface DtoMapper {
    SimpleUser userDtoMapper(User user);
}

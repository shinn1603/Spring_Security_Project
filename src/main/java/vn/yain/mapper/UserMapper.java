package vn.yain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.yain.dto.UserDTO;
import vn.yain.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(
        target = "roleName",
        source = "role.name"
    )
    UserDTO toDTO(User user);
}

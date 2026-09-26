package vn.yain.mapper;

import org.mapstruct.*;
import vn.yain.dto.UserDTO;
import vn.yain.entity.User;

@Mapper(componentModel = "spring",
 unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
 @Mapping(target = "roleName", source = "role.name")
 UserDTO toDTO(User entity);

 @Mapping(target = "role", ignore = true)
 @Mapping(target = "products", ignore = true)
 @Mapping(target = "password", ignore = true)
 User toEntity(UserDTO dto);
}

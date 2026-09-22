package vn.yain.service;

import vn.yain.dto.UserDTO;

public interface UserService {
    UserDTO findById(Long id);
}

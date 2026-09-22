package vn.yain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.yain.dto.UserDTO;
import vn.yain.entity.User;
import vn.yain.mapper.UserMapper;
import vn.yain.repository.UserRepository;
import vn.yain.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return userMapper.toDTO(user);
    }
}

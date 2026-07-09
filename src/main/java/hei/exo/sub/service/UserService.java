package hei.exo.sub.service;

import hei.exo.sub.dto.request.CreateUserRequest;
import hei.exo.sub.dto.response.UserResponse;
import hei.exo.sub.mapper.UserMapper;
import hei.exo.sub.model.User;
import hei.exo.sub.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  @Transactional
  public UserResponse create(CreateUserRequest request) {
    User user = userMapper.toEntity(request);

    User savedUser = userRepository.save(user);

    return userMapper.toResponse(savedUser);
  }
}

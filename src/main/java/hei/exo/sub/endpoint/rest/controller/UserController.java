package hei.exo.sub.endpoint.rest.controller;

import hei.exo.sub.dto.request.CreateUserRequest;
import hei.exo.sub.dto.response.UserResponse;
import hei.exo.sub.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/users")
  public UserResponse create(@Valid @RequestBody CreateUserRequest request) {
    return userService.create(request);
  }
}

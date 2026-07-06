package hei.exo.sub.mapper;

import hei.exo.sub.dto.response.UserResponse;
import hei.exo.sub.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getUserName());
    }
}
package hei.exo.sub.mapper;

import hei.exo.sub.entity.UserEntity;
import hei.exo.sub.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toModel(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getEmail());
    }
}

package hei.exo.sub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "user")
@Data

public class UserEntity {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
}

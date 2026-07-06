package hei.exo.sub.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "subscription")
@Data

public class SubscriptionEntity {
    @Id private UUID id;
    private UUID userId;
    private UUID courseId;
}

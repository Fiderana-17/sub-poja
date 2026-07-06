package hei.exo.sub.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "subscription")
public class SubscriptionEntity {
    @Id private UUID id;
    private UUID userId;
    private UUID courseId;
}

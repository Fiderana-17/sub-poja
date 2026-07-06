package hei.exo.sub.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "subscription")
public class SubscriptionEntity {
    @Id private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity courseEntity;
}

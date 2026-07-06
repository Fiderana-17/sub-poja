package hei.exo.sub.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "subscription")
public class Subscription {
    @Id private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}

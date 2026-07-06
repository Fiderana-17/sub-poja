package hei.exo.sub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "course")
@Data

public class CourseEntity {
    @Id private UUID id;
    private String title;
    private Instant start;
    private Instant end;
}

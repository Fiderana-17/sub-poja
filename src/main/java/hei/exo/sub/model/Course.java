package hei.exo.sub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "course")
public class Course {
    @Id private UUID id;
    private String title;
    private Instant start;
    private Instant end;
}

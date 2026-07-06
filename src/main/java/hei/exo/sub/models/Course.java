package hei.exo.sub.models;

import java.time.Instant;
import java.util.UUID;

public record Course(UUID id, String title , Instant start , Instant end) {}

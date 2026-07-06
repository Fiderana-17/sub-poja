package hei.exo.sub.models;

import java.util.UUID;

public record Subscription(UUID id, UUID userId , UUID courseId) {}

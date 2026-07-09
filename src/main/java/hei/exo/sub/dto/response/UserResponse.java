package hei.exo.sub.dto.response;

import java.util.UUID;

public record UserResponse(UUID id, String firstName, String lastName, String userName) {}

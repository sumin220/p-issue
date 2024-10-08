package proj.AIssue.global.exception.dto;

import lombok.Builder;

@Builder
public record ErrorResponseVO (
        String name,
        int errorCode,
        String message
) {}

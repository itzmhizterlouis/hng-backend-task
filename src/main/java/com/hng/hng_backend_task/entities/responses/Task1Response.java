package com.hng.hng_backend_task.entities.responses;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class Task1Response {

    private String email;
    private Instant current_datetime;
    private String github_url;
}

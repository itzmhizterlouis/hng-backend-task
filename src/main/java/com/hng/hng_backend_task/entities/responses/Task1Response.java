package com.hng.hng_backend_task.entities.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task1Response {

    private String email;
    private String current_datetime;
    private String github_url;
}

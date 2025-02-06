package com.hng.hng_backend_task.entities.responses;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task2ErrorResponse {

    private String number;
    private boolean error;
}

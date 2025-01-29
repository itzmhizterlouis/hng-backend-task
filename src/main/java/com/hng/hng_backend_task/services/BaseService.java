package com.hng.hng_backend_task.services;

import com.hng.hng_backend_task.entities.responses.Task1Response;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class BaseService {

    public Task1Response task1() {

        return Task1Response.builder()
                .email("itzmhizterlouis@gmail.com")
                .current_datetime(Instant.now())
                .github_url("https://github.com/itzmhizterlouis/hng-backend-task")
                .build();
    }
}

package com.hng.hng_backend_task.controllers;

import com.hng.hng_backend_task.entities.responses.Task1Response;
import com.hng.hng_backend_task.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BaseController {

    private final BaseService baseService;

    @GetMapping
    public Task1Response task1() {

        return baseService.task1();
    }
}

package com.hng.hng_backend_task.controllers;

import com.hng.hng_backend_task.entities.requests.Task2Response;
import com.hng.hng_backend_task.entities.responses.Task1Response;
import com.hng.hng_backend_task.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BaseController {

    private final BaseService baseService;

    @GetMapping
    public Task1Response task1() {

        return baseService.task1();
    }

    @GetMapping("api/classify-number")
    public Task2Response task2(@RequestParam String number) {

        return baseService.task2(number);
    }
}

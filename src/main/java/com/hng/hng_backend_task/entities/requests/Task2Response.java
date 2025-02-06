package com.hng.hng_backend_task.entities.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Task2Response {

    private int number;
    @JsonProperty("is_prime")
    private boolean is_prime;
    @JsonProperty("is_perfect")
    private boolean is_perfect;
    private List<String> properties;
    private int digit_sum;
    private String fun_fact;
}

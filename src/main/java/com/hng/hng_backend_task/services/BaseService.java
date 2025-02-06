package com.hng.hng_backend_task.services;

import com.hng.hng_backend_task.entities.requests.Task2Response;
import com.hng.hng_backend_task.entities.responses.Task1Response;
import com.hng.hng_backend_task.exceptions.Task2Exception;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BaseService {

    private final RestTemplate restTemplate;

    public Task1Response task1() {

        return Task1Response.builder()
                .email("itzmhizterlouis@gmail.com")
                .current_datetime(Instant.now().toString())
                .github_url("https://github.com/itzmhizterlouis/hng-backend-task")
                .build();
    }

    public Task2Response task2(String num) {

        String task2ApiUrl = "http://numbersapi.com/" + num + "/math";

        int number = 0;

        try {

            number = Integer.parseInt(num);
        } catch (Exception ex) {

            throw new Task2Exception();
        }
        String fun_fact = restTemplate.getForObject(task2ApiUrl, String.class);

        List<String> properties = new ArrayList<>();

        if (isArmstrong(number)) {
            properties.add("armstrong");
        }
        if (isEven(number)) {
            properties.add("even");
        }
        else {
            properties.add("odd");
        }

        return Task2Response.builder()
                .number(number)
                .is_perfect(isPrime(number))
                .is_perfect(isPerfect(number))
                .digit_sum(sumOfDigits(number))
                .fun_fact(fun_fact)
                .properties(properties)
                .build();
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPerfect(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, n = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, n);
            num /= 10;
        }

        return sum == originalNum;
    }

    public boolean isEven(int number) {

        return number % 2 == 0;
    }
}

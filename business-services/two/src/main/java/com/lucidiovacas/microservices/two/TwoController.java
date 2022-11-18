package com.lucidiovacas.microservices.two;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("api/v1/two")
public class TwoController {
    private RestTemplate restTemplate;

    @GetMapping
    @RequestMapping("check-health")
    public String checkHealth() {
        log.info("Checking health request for Microservice TWO");
        return "Microservice TWO working OK";
    }

    @GetMapping
    @RequestMapping("call-check-health-one")
    public String getCheckHealthFromOne() {
        return restTemplate.getForObject("http://localhost:8900/api/v1/one/check-health", String.class);
    }
}

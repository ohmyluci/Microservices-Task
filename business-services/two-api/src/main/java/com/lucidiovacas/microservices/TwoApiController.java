package com.lucidiovacas.microservices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/two-api")
public class TwoApiController {

    @GetMapping
    @RequestMapping("check-health")
    public String checkHealth() {
        log.info("Checking health request for Microservice TWO API");
        return "Microservice TWO-API working OK";
    }
}

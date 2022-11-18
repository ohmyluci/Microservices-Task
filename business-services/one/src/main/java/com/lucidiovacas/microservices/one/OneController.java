package com.lucidiovacas.microservices.one;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/one")
public class OneController {

    @GetMapping
    @RequestMapping("check-health")
    public String checkHealth() {
        log.info("Checking health request for Microservice ONE");
        return "Microservice ONE working OK";
    }
}

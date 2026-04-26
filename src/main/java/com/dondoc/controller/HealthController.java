package com.dondoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String hello(){
        return "기본 페이지 띄우기 완료~~!!!!";
    }

    @GetMapping("/api/health")
    public String health(){
        return "server is running";
    }
}

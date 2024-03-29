package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-provider")
public interface FeignServiceTestDemo {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String feignTest();
}

package com.example.feign.web;

import com.example.comment.demo.TestDemo;
import com.example.feign.service.FeignServiceTestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestDemo {
    @Autowired
    private FeignServiceTestDemo feignServiceTestDemo;

    @RequestMapping("/test")
    public String test(){
        //return feignServiceTestDemo.feignTest();
        return TestDemo.he();
    }
}

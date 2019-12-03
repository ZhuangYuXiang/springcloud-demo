package com.example.euerka_client.web;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderTestDemo {
    @RequestMapping("/test")
    public String test(){
        return "-----------------------------测试提供实现------------------------------";
    }
}

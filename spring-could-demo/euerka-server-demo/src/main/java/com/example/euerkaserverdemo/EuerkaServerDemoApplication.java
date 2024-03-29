package com.example.euerkaserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   // 启动Eureka服务
public class EuerkaServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuerkaServerDemoApplication.class, args);
    }

}

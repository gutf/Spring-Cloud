package com.gtf.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author : GTF
 * @version : 1.0
 * @date : 2022/6/27 11:25
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka01Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application.class, args);
    }
}

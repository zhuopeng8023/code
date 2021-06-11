package com.zhss;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan(value = "com.zhss.*")
@EnableDiscoveryClient
@SpringBootApplication
public class OrderApplication {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);

        new Thread(() -> System.out.println("run")).start();
    }
}

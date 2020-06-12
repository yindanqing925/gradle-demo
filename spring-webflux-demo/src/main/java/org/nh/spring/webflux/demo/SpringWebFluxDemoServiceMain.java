package org.nh.spring.webflux.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringWebFluxDemoServiceMain.java
 * @author: yindanqing
 * @create: 2020/6/12 15:28
 * @description: 启动类
 */
@SpringBootApplication
public class SpringWebFluxDemoServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebFluxDemoServiceMain.class, args);
        System.out.println("WebFlux demo start success.");
    }

}

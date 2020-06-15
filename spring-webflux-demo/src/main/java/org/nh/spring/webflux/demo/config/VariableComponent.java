package org.nh.spring.webflux.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 本地变量
 */
@Component
public class VariableComponent {

    @Value("${local.name}")
    private String name;

    public String getName() {
        return name;
    }
}

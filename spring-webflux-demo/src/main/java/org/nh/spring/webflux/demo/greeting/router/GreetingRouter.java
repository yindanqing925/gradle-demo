package org.nh.spring.webflux.demo.greeting.router;

import org.nh.spring.webflux.demo.greeting.rest.GreetingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

/**
 * @program: GreetingRouter.java
 * @author: yindanqing
 * @create: 2020/6/12 15:57
 * @description:
 */
@Configuration
public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler){
        return RouterFunctions.route(RequestPredicates.GET("/hello")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), greetingHandler::hello);
    }

}

package org.nh.spring.webflux.demo.greeting.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @program: GreetingHandler.java
 * @author: yindanqing
 * @create: 2020/6/12 15:11
 * @description:
 */
@Component
public class GreetingHandler {

    public Mono<ServerResponse> hello(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromValue("Hello, Spring!"));
    }

}

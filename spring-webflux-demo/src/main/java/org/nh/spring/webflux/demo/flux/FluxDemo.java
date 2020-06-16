package org.nh.spring.webflux.demo.flux;

import reactor.core.publisher.Flux;

public class FluxDemo {

    public static void main(String[] args) {
        Flux.range(1, 100).parallel().subscribe(System.out::println);
        Flux.range(1, 100).bufferUntil(i -> i % 7 == 0).subscribe(System.out::println);
        reactor.core.publisher.Flux.range(1, 100).bufferWhile(i -> i % 7 == 0).subscribe(System.out::println);
    }

}

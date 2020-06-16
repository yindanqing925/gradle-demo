package org.nh.spring.webflux.demo.flux;

import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoDemo {



    public static void main(String[] args) {

        Bean bean = new Bean("here");

        Mono.fromCallable(() -> "9999").subscribe(System.out::println);
        Mono.create(monoSink -> monoSink.success("9999")).subscribe(System.out::println);
        Mono.create(monoSink -> monoSink.success("9999")).subscribe(System.out::println);
        Mono.just("9999").subscribe(System.out::println);
        /*ReactiveAdapter reactorAdapter = new ReactiveAdapter();
        Mono.from(reactorAdapter.toPublisher(new Bean("9999")));*/
        Mono.justOrEmpty(bean.getName()).subscribe(System.out::println);
        Mono.fromFuture(CompletableFuture.completedFuture(bean.getName())).subscribe(System.out::println);

    }

}

class Bean{

    public Bean(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.concurrent.Future<String> getNameAsync(){
        return new CompletableFuture<String>(){
            @Override
            public String get(){
                return name;
            }
        };
    }
}
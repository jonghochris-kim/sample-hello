package com.chris.samplehello.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello/greetings")
public class GreetingController {

    @GetMapping
    public Mono<?> getHello(@RequestParam(required = false) String name) {
        return Mono.just("hello, " + name);
    }
}

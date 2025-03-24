package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

// This is the worst way to do dependency injection

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

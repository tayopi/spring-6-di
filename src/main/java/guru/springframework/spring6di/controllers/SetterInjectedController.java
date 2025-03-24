package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

// Better than property injection bu still not good

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

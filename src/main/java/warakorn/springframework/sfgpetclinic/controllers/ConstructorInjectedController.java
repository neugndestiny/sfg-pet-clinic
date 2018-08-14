package warakorn.springframework.sfgpetclinic.controllers;

import warakorn.springframework.sfgpetclinic.services.GreetingService;

public class ConstructorInjectedController {
    public GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

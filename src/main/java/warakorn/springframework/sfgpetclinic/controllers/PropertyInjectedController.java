package warakorn.springframework.sfgpetclinic.controllers;

import warakorn.springframework.sfgpetclinic.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}

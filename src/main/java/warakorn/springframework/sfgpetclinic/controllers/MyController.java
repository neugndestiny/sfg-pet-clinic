package warakorn.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import warakorn.springframework.sfgpetclinic.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("hello");

        return "haha";
    }
}

package warakorn.springframework.sfgpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import warakorn.springframework.sfgpetclinic.services.GreetingService;
import warakorn.springframework.sfgpetclinic.services.GreetingServiceImp;

@Controller
public class PropertyInjectedController {

    /**
     * @Autowired gonna tell spring that we gonna injected
     */
    @Autowired
    @Qualifier("greetingServiceImp")
    public GreetingService greetingServiceImp;

    public String sayHello(){
        return greetingServiceImp.sayGreeting();
    }

}

package warakorn.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello this is constructor greeting";
    }
}

package warakorn.springframework.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryThaiGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryThaiGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "สวัสดี";
    }
}

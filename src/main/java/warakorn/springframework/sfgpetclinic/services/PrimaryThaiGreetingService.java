package warakorn.springframework.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimaryThaiGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "สวัสดี";
    }
}

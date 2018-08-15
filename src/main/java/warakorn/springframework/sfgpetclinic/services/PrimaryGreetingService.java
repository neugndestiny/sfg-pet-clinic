package warakorn.springframework.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary /*If more than one bean, I wanna use this one*/
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, this is primary greeting service";
    }
}

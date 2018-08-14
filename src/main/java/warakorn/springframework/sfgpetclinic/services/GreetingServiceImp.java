package warakorn.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {

    public static final String HelloSentence = "Hello it's me";

    public String sayGreeting() {
        return HelloSentence;
    }
}

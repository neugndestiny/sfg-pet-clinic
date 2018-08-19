package warakorn.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getThaiGreeting() {
        return "ดีจ้า";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello my name is greeting";
    }
}

package warakorn.springframework.sfgpetclinic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import warakorn.springframework.sfgpetclinic.services.GreetingRepository;
import warakorn.springframework.sfgpetclinic.services.GreetingService;
import warakorn.springframework.sfgpetclinic.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfiguration {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("th")
    GreetingService primaryThaiGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("th");
    }


}

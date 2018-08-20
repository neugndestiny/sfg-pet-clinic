package warakorn.springframework.sfgpetclinic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import warakorn.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import warakorn.springframework.sfgpetclinic.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

    @Value("${warakorn.username}")
    String user;

    @Value("${warakorn.password}")
    String password;

    @Value("${warakorn.durl}")
    String url;

    @Value("${warakorn.jms.username}")
    String jmsUsername;

    @Value("${warakorn.jms.password}")
    String jmsPassword;

    @Value("${warakorn.jms.url}")
    String jmsUrl;

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

}

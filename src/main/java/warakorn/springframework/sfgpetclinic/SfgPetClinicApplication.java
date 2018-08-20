package warakorn.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import warakorn.springframework.sfgpetclinic.controllers.MyController;
import warakorn.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import warakorn.springframework.sfgpetclinic.examplebeans.FakeJmsBroker;

@SpringBootApplication
@ComponentScan(basePackages = {"warakorn.springframework.sfgpetclinic.services","warakorn.springframework"})
public class SfgPetClinicApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());
    }
}

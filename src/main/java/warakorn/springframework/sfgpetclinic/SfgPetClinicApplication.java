package warakorn.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import warakorn.springframework.sfgpetclinic.controllers.MyController;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }
}

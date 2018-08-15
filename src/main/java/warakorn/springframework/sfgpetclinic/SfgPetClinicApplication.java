package warakorn.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import warakorn.springframework.sfgpetclinic.controllers.ConstructorInjectedController;
import warakorn.springframework.sfgpetclinic.controllers.MyController;
import warakorn.springframework.sfgpetclinic.controllers.PropertyInjectedController;
import warakorn.springframework.sfgpetclinic.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}

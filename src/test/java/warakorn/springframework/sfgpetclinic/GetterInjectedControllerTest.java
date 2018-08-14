package warakorn.springframework.sfgpetclinic;

import org.junit.Before;
import org.junit.Test;
import warakorn.springframework.sfgpetclinic.controllers.SetterInjectedController;
import warakorn.springframework.sfgpetclinic.services.GreetingServiceImp;
import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImp());
    }

    @Test
    public void testGreeding() throws Exception {
        assertEquals(GreetingServiceImp.HelloSentence, setterInjectedController.sayHello());
    }
}

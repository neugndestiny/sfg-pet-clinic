package warakorn.springframework.sfgpetclinic;

import org.junit.Before;
import org.junit.Test;
import warakorn.springframework.sfgpetclinic.controllers.PropertyInjectedController;
import warakorn.springframework.sfgpetclinic.services.GreetingServiceImp;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImp();
    }

    @Test
    public void testGreeding() throws Exception {
        assertEquals(GreetingServiceImp.HelloSentence, propertyInjectedController.sayHello());
    }
}

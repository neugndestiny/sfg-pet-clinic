package warakorn.springframework.sfgpetclinic;

import org.junit.Before;
import org.junit.Test;
import warakorn.springframework.sfgpetclinic.controllers.ConstructorInjectedController;
import warakorn.springframework.sfgpetclinic.services.GreetingServiceImp;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImp.HelloSentence, constructorInjectedController.sayHello());
    }
}

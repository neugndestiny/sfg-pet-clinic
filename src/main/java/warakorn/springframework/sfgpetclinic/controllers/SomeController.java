package warakorn.springframework.sfgpetclinic.controllers;

public class SomeController {
    private MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}

package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class Mycontroller {

    public String sayHello(){
        System.out.println("Hello");
        return "Hi Folks";
    }

}

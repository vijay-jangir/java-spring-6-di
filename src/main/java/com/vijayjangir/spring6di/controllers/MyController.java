package com.vijayjangir.spring6di.controllers;

import com.vijayjangir.spring6di.services.GreetingService;
import com.vijayjangir.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}

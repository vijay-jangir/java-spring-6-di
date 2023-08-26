package com.vijayjangir.spring6di.controllers;

import com.vijayjangir.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

//    @Qualifier("greetingServiceSetterInjected")
    @Autowired
//    @Qualifier("propertyGreetingService") both doesn't work, here and in arguments
    public void setGreetingService(@Qualifier("greetingServiceSetterInjected") GreetingService greetingService) {
        System.out.println("setter called");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayGreeting();
    }
}

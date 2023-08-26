package com.vijayjangir.spring6di.controllers;

import com.vijayjangir.spring6di.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayGreeting();
    }
}

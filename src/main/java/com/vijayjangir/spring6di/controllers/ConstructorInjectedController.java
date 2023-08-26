package com.vijayjangir.spring6di.controllers;

import com.vijayjangir.spring6di.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

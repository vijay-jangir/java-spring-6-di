package com.vijayjangir.spring6di.controllers;

import com.vijayjangir.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

package com.vijayjangir.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from Say Greeting service GreeingServiceImpl";
    }
}

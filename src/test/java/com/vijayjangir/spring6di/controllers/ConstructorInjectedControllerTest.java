package com.vijayjangir.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.vijayjangir.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println("from constructor setter: " + constructorInjectedController.sayHello());
    }
}
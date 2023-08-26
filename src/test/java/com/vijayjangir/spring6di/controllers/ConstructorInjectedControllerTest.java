package com.vijayjangir.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.vijayjangir.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println("from constructor setter: " + constructorInjectedController.sayHello());
    }
}
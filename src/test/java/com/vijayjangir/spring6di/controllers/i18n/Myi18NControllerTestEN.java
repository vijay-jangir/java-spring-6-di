package com.vijayjangir.spring6di.controllers.i18n;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
class Myi18NControllerTestEN {

    @Autowired
    private Myi18NController myi18NController;

    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
    }
}
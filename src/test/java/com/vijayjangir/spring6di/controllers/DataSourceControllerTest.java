package com.vijayjangir.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataSourceControllerTest {

    @Autowired
    private DataSourceController dataSourceController;

    @Test
    void getSource() {
        System.out.println(dataSourceController.getSource());
    }
}
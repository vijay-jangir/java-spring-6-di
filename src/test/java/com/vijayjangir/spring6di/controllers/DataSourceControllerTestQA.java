package com.vijayjangir.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "HI"})
@SpringBootTest
class DataSourceControllerTestQA {

    @Autowired
    private DataSourceController dataSourceController;

    @Test
    void getSource() {
        System.out.println(dataSourceController.getSource());
    }
}
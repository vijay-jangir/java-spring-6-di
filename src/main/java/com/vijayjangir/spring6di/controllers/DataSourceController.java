package com.vijayjangir.spring6di.controllers;

import com.vijayjangir.spring6di.services.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    private final DataSourceService dataSourceService;

    public DataSourceController(@Qualifier("dataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getSource() {
        return dataSourceService.getSource();
    }
}

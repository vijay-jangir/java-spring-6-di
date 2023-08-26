package com.vijayjangir.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("dataSourceService")
public class DataSourceServiceProd implements DataSourceService {
    @Override
    public String getSource() {
        return "This is PROD source";
    }
}

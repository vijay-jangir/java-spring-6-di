package com.vijayjangir.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("dataSourceService")
public class DataSourceServiceUAT implements DataSourceService {
    @Override
    public String getSource() {
        return "This is UAT source";
    }
}

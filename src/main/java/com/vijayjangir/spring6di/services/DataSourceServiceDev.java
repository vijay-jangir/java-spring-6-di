package com.vijayjangir.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("dataSourceService")
public class DataSourceServiceDev implements DataSourceService {
    @Override
    public String getSource() {
        return "This is dev source";
    }
}

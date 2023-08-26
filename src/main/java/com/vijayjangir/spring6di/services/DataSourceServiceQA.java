package com.vijayjangir.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("dataSourceService")
public class DataSourceServiceQA implements DataSourceService {
    @Override
    public String getSource() {
        return "This is QA source";
    }
}

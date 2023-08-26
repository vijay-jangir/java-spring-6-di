package com.vijayjangir.spring6di.services.i18n;

import com.vijayjangir.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HI", "default"})
@Service("i18NService")
public class HindiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Namaste - HI";
    }
}

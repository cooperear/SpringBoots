package com.rookies4.MySpringBootLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class DevConfig {

    @Bean
    public MyEnvironment myEnvironment() {
        MyEnvironment myEnvironment = new MyEnvironment();
        myEnvironment.setMode("개발환경");
        return myEnvironment;
    }
}
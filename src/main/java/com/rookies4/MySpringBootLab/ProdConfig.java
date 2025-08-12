package com.rookies4.MySpringBootLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdConfig {

    @Bean
    public MyEnvironment myEnvironment() {
        MyEnvironment myEnvironment = new MyEnvironment();
        myEnvironment.setMode("운영환경");
        return myEnvironment;
    }
}
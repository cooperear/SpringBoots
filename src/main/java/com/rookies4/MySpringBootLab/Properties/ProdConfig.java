package com.rookies4.MySpringBootLab.Properties;

import com.rookies4.MySpringBootLab.enviroment.MyEnvironment;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
@Getter @Setter

public class ProdConfig{
    @Bean(name="myEnvironment")
    public MyEnvironment myEnvironment() {
        return MyEnvironment.builder().mode("운영환경").build();
    }


}

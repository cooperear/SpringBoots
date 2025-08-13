package com.rookies4.MySpringBootLab.Runner;

import com.rookies4.MySpringBootLab.Properties.ProdConfig;
import com.rookies4.MySpringBootLab.Properties.TestConfig;
import com.rookies4.MySpringBootLab.enviroment.MyEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements ApplicationRunner {
    @Value("${myprop.username}")
    private String userName;

    @Value("${myprop.port}")
    private int port;

    @Autowired
    private Environment environment;

    @Autowired
    private MyEnvironment myEnvironment;
    @Autowired(required = false)
    private ProdConfig prodConfig;
    @Autowired(required = false)
    private TestConfig testConfig;

    private Logger logger = LoggerFactory.getLogger(MyPropRunner.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {


//        System.out.println("myEnvironment.getClass().getName() = " + myEnvironment.getClass().getName());
        logger.info("\"myEnvironment.getClass().getName() = {}",myEnvironment.getClass().getName());



    }

}

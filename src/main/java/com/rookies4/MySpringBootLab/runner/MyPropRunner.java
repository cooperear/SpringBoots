package com.rookies4.MySpringBootLab.runner;

import com.rookies4.MySpringBootLab.MyPropProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyPropRunner.class);

    @Autowired
    private MyPropProperties myPropProperties;

    @Override
    public void run(String... args) throws Exception {

        logger.info("--- RUNNER 시작 ---");

//        System.out.println("myPropProperties.getUsername() = " + myPropProperties.getUsername());
        logger.debug("Username= {}", myPropProperties.getUsername());
//        System.out.println("port = " + myPropProperties.getPort());
        logger.debug("Port= {}", myPropProperties.getPort());

        logger.info("--- RUNNER종료 ---");
    }
}
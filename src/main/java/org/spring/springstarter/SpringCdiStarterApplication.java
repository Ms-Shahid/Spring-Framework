package org.spring.springstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springstarter.contextdependencyInjection.BusinessCdi;
import org.spring.springstarter.scope.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCdiStarterApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiStarterApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringCdiStarterApplication.class, args);

        BusinessCdi businessCdi = applicationContext.getBean(BusinessCdi.class);

        LOGGER.info("{} repo -> {}", businessCdi, businessCdi.getCdi());


    }

}

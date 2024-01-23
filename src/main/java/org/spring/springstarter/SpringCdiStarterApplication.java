package org.spring.springstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springstarter.contextdependencyInjection.BusinessCdi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringCdiStarterApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiStarterApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCdiStarterApplication.class);

        BusinessCdi businessCdi = applicationContext.getBean(BusinessCdi.class);

        LOGGER.info("{} repo -> {}", businessCdi, businessCdi.getCdi());


    }

}

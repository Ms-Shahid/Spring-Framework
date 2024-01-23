package org.spring.springstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springstarter.properties.ExternalProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan()
@PropertySource("classpath:application.properties")
public class PropertiesStarterApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(PropertiesStarterApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                PropertiesStarterApplication.class)) {

            ExternalProperty service = applicationContext.getBean(ExternalProperty.class);
            LOGGER.info("url ->  {} ", service.getUrl());
        }
    }

}

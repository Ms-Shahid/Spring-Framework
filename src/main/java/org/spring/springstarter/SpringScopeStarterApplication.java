package org.spring.springstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springstarter.scope.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringScopeStarterApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeStarterApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringScopeStarterApplication.class, args);

        Person person1 = applicationContext.getBean(Person.class);
        Person person2 = applicationContext.getBean(Person.class);

        LOGGER.info("{}", person1);
        LOGGER.info("{}", person1.getJdbcConnection());

        LOGGER.info("{}", person2);
        LOGGER.info("{}", person2.getJdbcConnection());

    }

}

package org.spring.springstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springstarter.scope.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class SpringJavaScopeStarterApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringJavaScopeStarterApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringJavaScopeStarterApplication.class);
        Person person1 = applicationContext.getBean(Person.class);
        Person person2 = applicationContext.getBean(Person.class);

        LOGGER.info("{}", person1);
        LOGGER.info("{}", person1.getJdbcConnection());

        LOGGER.info("{}", person2);
        LOGGER.info("{}", person2.getJdbcConnection());

    }

}

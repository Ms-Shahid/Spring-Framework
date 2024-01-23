package org.spring.springstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springstarter.xmlscope.XmlClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlScopeStarterApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(XmlScopeStarterApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext(
                             "applicationContext.xml"
                     )) {

            XmlClient client = applicationContext.getBean(XmlClient.class);

            LOGGER.info("{}", client);
            LOGGER.info("{}", client.getXmljdbcconnection());
            LOGGER.info(" Beans -> {}", (Object) applicationContext.getBeanDefinitionNames());
        }
    }
}

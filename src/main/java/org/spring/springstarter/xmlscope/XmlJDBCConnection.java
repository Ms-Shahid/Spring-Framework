package org.spring.springstarter.xmlscope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class XmlJDBCConnection {

    public XmlJDBCConnection() {
        System.out.println("JDBC connection..");
    }

    @PostConstruct
    public void postContruct(){
        System.out.println(" Post Construct...");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destory...");
    }

}

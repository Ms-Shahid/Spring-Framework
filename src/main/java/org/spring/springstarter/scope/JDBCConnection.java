package org.spring.springstarter.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {

    public JDBCConnection() {
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

package org.spring.springstarter.contextdependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCdi {
    @Autowired
    RepoCdi cdi;

    public RepoCdi getCdi() {
        return cdi;
    }

    public void setCdi(RepoCdi cdi) {
        this.cdi = cdi;
    }
}

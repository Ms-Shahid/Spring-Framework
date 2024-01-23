package org.spring.springstarter.contextdependencyInjection;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class BusinessCdi {
    @Inject
    RepoCdi cdi;

    public RepoCdi getCdi() {
        return cdi;
    }

    public void setCdi(RepoCdi cdi) {
        this.cdi = cdi;
    }
}

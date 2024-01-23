package org.spring.springstarter.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalProperty {

    @Value("${external.service.url}")
    private String url;

    public String getUrl(){
        return url;
    }
}

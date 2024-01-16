package org.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginValidationService {

    public boolean isUserValid( String user, String password ){
        if( user.equalsIgnoreCase("Shahid") && password.equals("1234")) return true;
        return false;

    }
}

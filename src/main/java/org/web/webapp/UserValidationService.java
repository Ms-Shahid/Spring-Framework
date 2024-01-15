package org.web.webapp;

public class UserValidationService {

    public boolean isUserValid( String user, String password ){
        if( user.equalsIgnoreCase("Shahid") && password.equals("1234")) return true;
        return false;

    }
}

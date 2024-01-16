package org.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.web.service.LoginValidationService;

@Controller
public class LoginController {

    @Autowired
    LoginValidationService service;
    @RequestMapping(value = "/login", method = RequestMethod.GET)/* to handle only the GET method*/
//    @ResponseBody
    public String login(){ return "login"; }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap modelMap){

        if( !service.isUserValid(username, password)) {
            modelMap.put("errorMessage", "Oops! Invalid details");
            return "login";
        }
        else {
            modelMap.put("username", username);
            return "welcome";
        }
    }


}

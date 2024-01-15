package org.web.webapp;

import org.web.webapp.validations.UserValidationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginPage extends HttpServlet {

    private UserValidationService validationService = new UserValidationService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setAttribute("name", request.getParameter("name"));
//        request.setAttribute("password", request.getParameter("password"));
        request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isUserValid = validationService.isUserValid(username, password);
        if( isUserValid ){

            request.setAttribute("username", username);
            request.setAttribute("password", password);

            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        }
        else{
            request.setAttribute("errorMessage", "Oops! Username or Password is invalid");
            request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
        }
    }

    }

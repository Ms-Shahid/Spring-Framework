package org.web.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/resource.do")
public class DisplayResources extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title> resources 🧐</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2>");
        writer.println(" Launching up the Resources..");
        writer.println("</h2>");
        writer.println("<h2>");
        writer.println(" Resources..");
        writer.println("</h2>");
        writer.println("</body>");
        writer.println("</html>");
    }

}

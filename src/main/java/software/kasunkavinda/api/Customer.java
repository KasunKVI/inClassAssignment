package software.kasunkavinda.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

@WebServlet(name = "Cutomer", urlPatterns = "/customer")
public class Customer extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uri = req.getRequestURI();
        String lastSegment = StringUtils.substringAfterLast(uri, "/");

        String name = req.getParameter("name");
        String contact = req.getParameter("contact");

        System.out.println(lastSegment);
        System.out.println("Name : "+name +"\n" + "Contact : "+contact);

    }
}

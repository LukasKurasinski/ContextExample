package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/contextMaker")
public class ContextMake extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().setInitParameter("WelcomeMessageFromInit", "Hello from contextMaker Init");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        getServletContext().setAttribute("WelcomeMessage", "Hello! from my Servlet World!");
        resp.getWriter().print("Go back to Context Grabber to see changes");
        String form = "<form action=/contextGrabber method=GET><input type=submit value=Go To Context Grabber with GET></input></form>";
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        String form = "<form action=/contextGrabber method=GET><input type=submit value=Go To Context Grabber with GET></input></form>";
        resp.getWriter().print("Go back to Context Grabber to see changes");
    }
}

package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contextGrabber")
public class ContextGrabber extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        String form = "<form action=/contextMaker method=POST><input type=submit value=go>Go To Context Maker with POST</input></form>";
        String getMethodAttribute = (String)getServletContext().getAttribute("WelcomeMessage") + "<br>";
        String servletInitAttribute = getServletContext().getInitParameter("WelcomeMessageFromInit")+ "<br>";
        String appInitAttribute = getServletContext().getInitParameter("WelcomeMessageFromAppInit") + "<br>";
        resp.getWriter().print(getMethodAttribute + servletInitAttribute + appInitAttribute + form);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

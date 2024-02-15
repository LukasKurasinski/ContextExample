package servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * In this class can we set init parameters on webapp start.
 * This class uses dependency injection defined with @WebListener annotation
 */
@WebListener
public class WebAppInit implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        event.getServletContext().setInitParameter("WelcomeMessageFromAppInit", "HelloFrom app Init!");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}

package edu.acc.jweb.comments;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CommentListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        CommentManager commentManager = new CommentManager();
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

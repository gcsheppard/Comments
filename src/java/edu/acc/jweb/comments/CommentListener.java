package edu.acc.jweb.comments;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CommentListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        CommentManager commentManager = new CommentManager();
        commentManager.addComment("What a great hotel!");
        commentManager.addComment("The hotel restaurant has good food.");
        commentManager.addComment("The penthouse view is incredible!");
        commentManager.addComment("Nice room, but the Internet could be faster.");
        commentManager.addComment("The price is reasonable for what you get.");
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("commentManager", commentManager);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

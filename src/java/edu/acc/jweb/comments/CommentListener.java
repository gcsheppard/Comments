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
        commentManager.addComment("What a great hotel!", "john", "john@gmail.com");
        commentManager.addComment("The hotel restaurant has good food.", "jane", "jane@yahoo.com");
        commentManager.addComment("The penthouse view is incredible!", "abby", "abby@kv.com");
        commentManager.addComment("Nice room, but the Internet could be faster.", "Orlando", "orlando@era.com");
        commentManager.addComment("The price is reasonable for what you get.", "Asha", "asha@netflix.com");
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("commentManager", commentManager);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

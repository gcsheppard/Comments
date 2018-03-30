package edu.acc.jweb.comments;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"", "/list", "/add"})
public class CommentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String choice = request.getParameter("choice");
        if (choice == null) {
            CommentManager commentManager = (CommentManager) getServletContext().getAttribute("commentManager");
            ArrayList<Comment> comments = commentManager.getComments();
            request.setAttribute("comments", comments);
            getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp").forward(request, response);
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/views/add.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String comment = request.getParameter("comment");
        CommentManager commentManager = (CommentManager) getServletContext().getAttribute("commentManager");
        commentManager.addComment(comment);
        response.sendRedirect("/Comments/list");  
    }
}

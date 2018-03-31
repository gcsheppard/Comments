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
    public String errors;

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
        errors = "";
        String comment = request.getParameter("comment");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        errors = validInput(comment, name, email, errors);
        if (errors.isEmpty()) {
            CommentManager commentManager = (CommentManager) getServletContext().getAttribute("commentManager");
            commentManager.addComment(comment, name, email);
            response.sendRedirect("/Comments/list"); 
        }
        else {
            request.setAttribute("comment", comment);
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("errors", errors);
            getServletContext().getRequestDispatcher("/WEB-INF/views/add.jsp").forward(request, response);                    
        }
    }
    
    private String validInput(String comment, String name, String email, String errors) {
        if (name.isEmpty()) errors = errors + "Name not entered.<br>";
        if (email.isEmpty()) errors = errors + "Email not entered.<br>";
        if (comment.isEmpty()) errors = errors + "Comment not entered.<br>";
        if (!errors.isEmpty()) errors = "Error(s):<br>" + errors;
        return errors;
    }
}

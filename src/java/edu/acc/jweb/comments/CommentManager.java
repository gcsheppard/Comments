package edu.acc.jweb.comments;
import java.util.ArrayList;

public class CommentManager {
    private final ArrayList<Comment> list;
    
    public CommentManager () {
        this.list = new ArrayList<>();
    }
    
    public void addComment(String comment) {
        Comment c = new Comment(comment);
        list.add(c);
    }
    public ArrayList<Comment> getComments() {
        return list;
    }
}

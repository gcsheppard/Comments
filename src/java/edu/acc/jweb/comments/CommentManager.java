package edu.acc.jweb.comments;
import java.util.ArrayList;

public class CommentManager {
    private final ArrayList<Comment> list;
    
    public CommentManager () {
        this.list = new ArrayList<>();
    }
    
    public void addComment(String comment, String name, String email) {
        Comment c = new Comment(comment, name, email);
        list.add(c);
        while (list.size() > 10) {
            list.remove(0);
        }
    }
    
    public ArrayList<Comment> getComments() {
        return list;
    }
}

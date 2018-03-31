package edu.acc.jweb.comments;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
    
    public String comment;
    public String name;
    public String email;
    public Date date;
    
    public Comment (String comment, String name, String email) {
        this.comment = comment;
        this.name = name;
        this.email = email;
        this.date = new Date();
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public String getname() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getDate() {
        Format formatter = new SimpleDateFormat("MM/dd/yyyy ");
        String string = formatter.format(this.date);
        return string;
    }
}

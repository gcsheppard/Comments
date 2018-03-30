package edu.acc.jweb.comments;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
    
    public String comment;
    public Date date;
    
    public Comment (String comment) {
        this.comment = comment;
        this.date = new Date();
    }
    
    public String getComment() {
        return comment;
    }
    
    public String getDate() {
        Format formatter = new SimpleDateFormat("MM/dd/yyyy ");
        String string = formatter.format(this.date);
        return string;
    }
}

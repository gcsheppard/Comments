<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Enter your comment:</h2>
        <form action="add" method="post">
            Name: <input type="text" name="name"><br>
            Email: <input type="text" name="email"><br>
            Comment: <textarea name="comment" rows="4" cols="50"></textarea>
                     <input type="submit" value="Submit" /><br>
        </form>  
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Comments/styles/styles.css">
    </head>
    <body>
        <h2>Enter your comment:</h2>
        <form action="add" method="post">
            <div class="b">Name: <input type="text" name="name" value="${name}"}></div><br>
            <div class="b">Email: <input type="text" name="email" value="${email}"></div><br>
            <div <div class="f">Comment: <textarea name="comment" rows="4" cols="50">${comment}</textarea></div><br>
            <div class="c"><input type="submit" value="Submit" /><br>
        </form>  
            <br><div class="e">${errors}</div>
    </body>
</html>

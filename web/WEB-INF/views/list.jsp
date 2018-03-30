<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <head>
        <link rel="stylesheet" href="/Comments/styles/styles.css">
    </head>
    <body>
        <p>Comments:</p>
        <ul>
            <c:forEach var="comment" items="${comments}">
                <li>
                    <div>
                        <c:out value = "${comment.date}: "/>
                        <c:out value = "${comment.comment}"/>
                    </div><br>
                </li>
            </c:forEach>
        </ul>
        <br><br><div><a href="/Comments/add?choice=add">Add a comment</a></div><br>
    </body>
</html>

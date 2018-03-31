<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Comments/styles/styles.css">
    </head>
    <body>
        <p>Comments:</p>
        <ul>
            <c:forEach var="comment" items="${comments}">
                <li>
                    
                    <div class ="f"><c:out value = "${comment.comment}"/></div>
                    <div class="a"><c:out value = "${comment.name} (${comment.email}) ${comment.date}"/></div>
                    <br>
                </li>
            </c:forEach>
        </ul>
        <br><div class="d"><a href="/Comments/add?choice=add">Add a comment</a></div><br>
    </body>
</html>

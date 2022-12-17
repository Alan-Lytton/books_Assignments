<%--
  Created by IntelliJ IDEA.
  User: alanlytton
  Date: 12/17/22
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <title>All Books</title>
</head>
<body>
<div class="container d-flex flex-column align-items-center">
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Language</th>
        <th># of Pages</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
    <tr>
        <th><c:out value="${book.id}"/></th>
        <td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
        <td><c:out value="${book.language}"/></td>
        <td><c:out value="${book.numberOfPages}"/></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>

<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

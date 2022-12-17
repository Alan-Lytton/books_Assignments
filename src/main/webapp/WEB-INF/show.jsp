<%--
  Created by IntelliJ IDEA.
  User: alanlytton
  Date: 12/17/22
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <title>Show</title>
</head>
<body>
<h1><c:out value="${title}"/></h1>
<p>Description: <c:out value="${desc}"/></p>
<p>Language: <c:out value="${lang}"/></p>
<p>Number of pages: <c:out value="${pages}"/></p>
<a href="/books">Go Back</a>

<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Demo</title>
</head>
<body>
    <h2>JSTL Demo</h2>

    <!-- Set a variable using JSTL -->
    <c:set var="message" value="Hello, CodeReady Studio!" />

    <!-- Display the variable using JSTL -->
    <p>${message}</p>

    <!-- Loop through a list using JSTL -->
    <c:forEach var="item" items="${'Item 1', 'Item 2', 'Item 3']}">
        <p>${item}</p>
    </c:forEach>

    <!-- Conditional display using JSTL -->
    <c:choose>
        <c:when test="${5 > 3}">
            <p>5 is greater than 3</p>
        </c:when>
        <c:otherwise>
            <p>5 is not greater than 3</p>
        </c:otherwise>
    </c:choose>
</body>
</html>

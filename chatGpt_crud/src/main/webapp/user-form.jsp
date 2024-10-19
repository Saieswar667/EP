<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
    <h2>User Form</h2>
    <form action="${action}" method="post">
        <input type="hidden" name="id" value="${user.id}">
        Name: <input type="text" name="name" value="${user.name}" required><br>
        Email: <input type="email" name="email" value="${user.email}" required><br>
        Country: <input type="text" name="country" value="${user.country}" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.wipro.model.Student"
    isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
</head>
<body>

<h1>Welcome to Spring MVC</h1>

<!-- Using Expression Language (EL) to display student details -->
<p>Student ID: ${xyz.stid}</p>
<p>Student Name: ${xyz.stname}</p>

</body>
</html>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Enables Expression Language (EL) -->
<%@ page isELIgnored="false"%> 

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
    <h1 style="text-align: center">Welcome to Home Page</h1>
    <br><br>
    
    <h3>ID: ${ID}</h3>
    <h3>Name: ${Name}</h3>
    <h3>Email: ${Email}</h3>
    
</body>
</html>

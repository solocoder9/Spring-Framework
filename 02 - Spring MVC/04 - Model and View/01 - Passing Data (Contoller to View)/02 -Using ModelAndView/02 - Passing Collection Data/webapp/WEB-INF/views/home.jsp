<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
    <h1 style="text-align: center">Welcome to Home Page</h1>
    <br><br>
    
    <% 
        // Retrieve the attributes set by the controller using ModelAndView (ID, Name, Email, Courses)
        Integer id = (Integer) request.getAttribute("ID");
        String name = (String) request.getAttribute("Name");
        String email = (String) request.getAttribute("Email");
        List<String> courses = (List<String>) request.getAttribute("Courses");
    %>
    
    <!-- Display the values of ID, Name, Email, and  Courses -->
    <h3>ID: <%=id %></h3>
    <h3>Name: <%=name%></h3>
    <h3>Email: <%=email%></h3>
    <h3>Courses: <%=courses%></h3>
    
</body>
</html>

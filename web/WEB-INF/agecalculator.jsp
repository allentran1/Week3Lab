<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 6:55:33 PM
    Author     : allen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
            Enter your age: <input type="text" name="age">
            <br>
            <input type="submit" value="age next birthday">
        </form>
        
          
        <p>${answer}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>

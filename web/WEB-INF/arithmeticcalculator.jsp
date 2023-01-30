<%-- 
    Document   : arithmeticcalculator
    Created on : 29-Jan-2023, 8:38:40 PM
    Author     : allen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first">
            <br>
            Second: <input type="text" name="second">
            <br>
            <input type="submit" value="+" name="operator">
            <input type="submit" value="-" name="operator">
            <input type="submit" value="*" name="operator">
            <input type="submit" value="%" name="operator">
        </form>
        <p>${answer}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>

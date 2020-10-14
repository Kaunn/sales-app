<%-- 
    Document   : jstl
    Created on : Oct 13, 2020, 7:16:48 PM
    Author     : leonardo
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL</title>
    </head>
    <body>
        <h1>JSTL - if</h1>
        <c:if test="${4>1}">
            <p>4 é maior que 1 
            </c:if>

        <h1>JSTL - Loop</h1>
        <c:forEach var="i" begin="1" end="10">
            <span>Aqui vai repetir - <span style="font-weight: 600;">${i}</span></span>
            </c:forEach>  

        <h1>JSTL - Switch</h1>
        <c:choose>
            <c:when test="${ 3 mod 2 == 0}">
                <p>par</p>
            </c:when>
            <c:otherwise>
                <p>não é par</p>
            </c:otherwise>    
        </c:choose> 

        <h1>JSTL - Var</h1>
        <c:set var="var1"  value="3" />
        <span>O valor de var1 é ${var1}</span>    
             


    </body>
</html>

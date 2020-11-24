<%-- 
    Document   : novo-cliente
    Created on : Sep 28, 2020, 7:32:04 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo cliente</title>
    </head>
    <body>
        <c:set var="path" value="${pageContext.request.contextPath}"/>
        ${error}
        <h1>Novo cliente</h1>
        <form action="${path}/customers/save" method="post">
            <input type="text" name="customer.name" placeholder="Nome" value="${customer.name}"/>
            <input type="text" name="customer.cpf" placeholder="CPF" value="${customer.cpf}"/>
            <button type="submit">Cadastrar</button>
        </form>
    </body>
</html>

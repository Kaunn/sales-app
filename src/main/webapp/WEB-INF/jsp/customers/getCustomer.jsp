<%-- 
    Document   : getCustomer
    Created on : Nov 16, 2020, 7:10:53 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edição do cliente</title>
    </head>
    <body>
        <c:set var="path" value="${pageContext.request.contextPath}"/>
        <h1>Você está editando o cliente: ${customer.name}</h1>
        <div>
            <form action="/${path}/customers/update" method="post">
                <input type="hidden" name="customer.id" value="${customer.id}"/>
                <input type="text" name="customer.name" placeholder="Nome" value="${customer.name}"/>
                <input type="text" name="customer.cpf" placeholder="CPF" value="${customer.cpf}"/>
                <button type="submit">Atualizar</button>
            </form>
        </div>
    </body>
</html>

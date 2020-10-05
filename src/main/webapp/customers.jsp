<%-- 
    Document   : customers
    Created on : Sep 29, 2020, 7:47:36 PM
    Author     : leonardo
--%>

<%@page import="br.edu.unijuazeiro.progiii.sales.models.Customer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Clientes cadastrados</h1>
        <% List<Customer> customersList = (List) application.getAttribute("customersList"); %>
        
        <% for (Customer customer : customersList) { %>
                <p><%=customer.getName()%></p>
        <% } %>

    </body>
</html>

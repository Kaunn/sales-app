<%-- 
    Document   : el.jsp
    Created on : Oct 6, 2020, 8:59:52 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL Page</title>
    </head>
    <body>
        <h1>Forma Antiga</h1>
        <h1>Forma Nova</h1>
       
        <p>Usuário: ${userLogged.getUsername()}</p>
        <p>Usuário: ${userLogged.username}</p>
        <p>3 > 4 = ${3>4}</p>
        <p>3 < 4 = ${3<4}</p>
        <p>3 == 4 = ${3==4}</p>
        <p> 3 gt 4 = ${3 gt 4}</p>
        <p> 3 lt 4 = ${3 lt 4}</p>
        <p> 3 eq 4 = ${ 3 eq 4}</p>
        <p> 3 ne 4 = ${ 3 ne 5}</p>
    </body>
</html>

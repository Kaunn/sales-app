<%-- 
    Document   : login
    Created on : Nov 17, 2020, 7:49:56 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Página de login</h1>
         <form action="auth" method="POST">
            <input type="text" placeholder="Usuário" name="user.username"/>
            <input type="password" placeholder="Senha" name="user.password"/>
            <button type="submit">Entrar</button>
        </form>
    </body>
</html>

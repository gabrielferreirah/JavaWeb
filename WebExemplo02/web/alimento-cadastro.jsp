<%-- 
    Document   : alimento-cadastro
    Created on : 13/08/2018, 11:01:17
    Author     : Alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int[] numeros = ((int[]) request.getAttribute("numeros")); %>
        <h1>Hello World ${nome}!</h1>
        <ul>
        <% for(int i = 0; i < numeros.length; i++) { ;%>
        
            <li><% out.print(numeros[i]); %></li>
    
        <% } %>
        </ul>
    </body>
</html>

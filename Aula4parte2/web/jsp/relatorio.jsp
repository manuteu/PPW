
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dados do usuário</title>
    </head>
    <body>
        <h1>Página final</h1>
        <table>
            <tr>
                <td>Nome:</td>                
                <td>${param.nome}</td>
            </tr>
            <tr>
                <td>Ano de nascimento:</td>                
                <td>${param.ano}</td>
            </tr>
            <tr>
                <td>Idade:</td>                
                <td>${requestScope.idadeCalculada}</td>               
            </tr>
        </table>
            <h2>Irmãos</h2>          
            
            <table border='1'>
                <% for(String Irmao:(List<String>) request.getAttribute("irmaos")) {%>
                <tr>
                    <td><%=Irmao%></td>                    
                </tr>
                <% } %>
            </table>
            
                <jsp:useBean id="usuario" class="entidade.Usuario" scope="request" />
                
                <ul>
                    <li>Nome de usuário: ${usuario.nome}</li>
                    <li>Senha do usuário: ${usuario.senha}</li>
                    <li>Idade do usuàrio: ${usuario.idade}</li>
                </ul>
                <ul>
                    <li>Nome de usuário: <jsp:getProperty name="usuario" property="nome"/></li>
                    <li>Senha do usuário: <jsp:getProperty name="usuario" property="senha"/></li>
                    <li>Idade do usuàrio: <jsp:getProperty name="usuario" property="idade"/></li>
                </ul>
            <br/>    
            <br/>
            <br/>
            <a href="index.html">Voltar</a>
    </body>
</html>

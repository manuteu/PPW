package br.eu.ceub.progweb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "facimfacim", urlPatterns = {"/facil", "/facim", "/dificil"},
        initParams = {
            @WebInitParam(name = "bairro", value = "Taguatinga")})
public class MundoMaisFacil extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Agora a vida ficou mais fácil!</h1>");
        resp.getWriter().println("<h4>Bairro :" + getInitParameter("bairro") + "</h4>");
    }

}

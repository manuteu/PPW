package br.edu.ceub.progwebn.maisservilet.servilet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OutraServlet", urlPatterns = {"/outraservlet"})
public class OutraServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Dados recebidos </h1>");
        resp.getWriter().println("Nome: " + req.getParameter("nome") + "<br/>");
        resp.getWriter().println("Idade: " + req.getParameter("idade") + "<br/>");
        resp.getWriter().println("<a href='maisservlet'>Voltar</a>");
        resp.getWriter().println("</html>");
    }

}

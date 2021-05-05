package br.edu.ceub.progwebn.maisservilet.servilet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MaisServlet", urlPatterns = {"/maisservlet"}, initParams = {
    @WebInitParam(name = "Estado", value = "Rio de Janeiro")
    , @WebInitParam(name = "Bairro", value = "Tijuca")})
public class MaisServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Minha servlet ainda mais fácil</h1>");
        resp.getWriter().println("<p>" + req.getParameter(" nome ") + " tem " + req.getParameter("idade") + " anos: </p>");

        resp.getWriter().println(gerarFormulario());
        resp.getWriter().println("</html>");
    }

    private String gerarFormulario() {
        String resposta;

        resposta = "<form method='GET' action='outraservlet>";
        resposta += "  Nome: <input type='text' name='nome'> <br/>";
        resposta += " Idade: <input type='text' name='idade'> <br/>";
        resposta += " <input type='submit' name='Enviar'><br/>";
        resposta += "</form>";

        return resposta;
    }

}

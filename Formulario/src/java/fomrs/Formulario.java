package fomrs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Formulario", urlPatterns = {"/form"})
public class Formulario extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Meu primeiro formulário</h1>");
        resp.getWriter().println("<form >");
        resp.getWriter().println("  Nome: <br/> <input type='text' name='nome'> <br/>");
        resp.getWriter().println(" E-mail: <br/> <input type='email' name='e-mail'> <br/>");
        resp.getWriter().println(" Telefone: <br/> <input type='text' name='telefone'> <br/>");
        resp.getWriter().println(" <input type='submit' name='Cadastrar' /><br/>");
        resp.getWriter().println("</form>");
        resp.getWriter().println("</html>");
    }

}

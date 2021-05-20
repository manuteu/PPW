package pacotinho;

import entidade.Usuario;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Processamento", urlPatterns = {"/Processamento"})
public class Processamento extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Fazendo o processamentyo dos dados recebidos na requisição
        Integer ano = Integer.valueOf(request.getParameter("ano"));
        Integer anoAtual = LocalDate.now().getYear();
        Integer idade = anoAtual - ano;

        //Simulando ida ao banco de dados para receber relação dos irmãos da pessoa consultada
        List<String> irmaos = new ArrayList<>();
        irmaos.add("Pedro");
        irmaos.add("Caio");
        irmaos.add("Ana");
        irmaos.add("Gisele");

        //Simulando obtenção dos dados de um usuário
        Usuario u = new Usuario();
        u.setNome("Gisele");
        u.setSenha("123@abc");
        u.setIdade(26);

        request.setAttribute("idadeCalculada", idade);
        request.setAttribute("irmaos", irmaos);
        request.setAttribute("usuario", u);

        request.getRequestDispatcher("jsp/relatorio.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

}

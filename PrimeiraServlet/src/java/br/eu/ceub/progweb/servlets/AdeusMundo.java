
package br.eu.ceub.progweb.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdeusMundo extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Adeus mundo cruel!");
        
        resp.getWriter().println("País: " + getServletConfig().getInitParameter("pais"));
        resp.getWriter().println("País 2: " + getInitParameter("pais"));
        
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); 
        
        System.out.println("País: " + config.getInitParameter("pais"));
    }
    
}


package com.mycompany.cadastrodeseries;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarSeries", urlPatterns = {"/CadastrarSeries"})
public class CadastrarSeries extends HttpServlet {

    try (PrintWriter out = response.getwriter()){
    
         out.println("!DOCTYPE html");
         out.println("<html>");
         out.println("<head>");
         out.println("<body>");
         out.println("Série Cadastrada");
         out.println("</body>");
         out.println("</head>");
         out.println("</html>");
}
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.leitor.Leitor;
import modelo.leitor.LeitorDAO;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;

/**
 *
 * @author creuma
 */
@WebServlet(name = "CadastroLeitorServlet", urlPatterns = {"/CadastroLeitorServlet"})
public class CadastroLeitorServlet extends HttpServlet {

    Leitor leitor = new Leitor();
    LeitorDAO leitorDao = new LeitorDAO();
    Pessoa pessoa = new Pessoa();
    PessoaDAO pessoaDao = new PessoaDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        pessoa.setPrimeiroNome(request.getParameter("primeiroNome").trim());
        pessoa.setUltimoNome(request.getParameter("ultimoNome").trim());
        System.out.println("Nomes de pessoa em leitor"+pessoa.getPrimeiroNome()+" "+pessoa.getUltimoNome());
        int idPessoa = pessoaDao.getIDPeloNome(pessoa.getPrimeiroNome(), pessoa.getUltimoNome());
        System.out.println("id:"+idPessoa);
        leitor.setFkPessoa(idPessoa);
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        leitor.setDataCadastroLeitor(date);
        leitorDao.inserir(leitor);
        System.out.println("Leitor cadastrado");
        response.sendRedirect("leitor.jsp");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

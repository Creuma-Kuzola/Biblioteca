/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.autor.Autor;
import modelo.autor.AutorDAO;
import modelo.leitor.Leitor;
import modelo.leitor.LeitorDAO;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;

/**
 *
 * @author creuma
 */
@WebServlet(name = "CadastroAutorServlet", urlPatterns = {"/CadastroAutorServlet"})
public class CadastroAutorServlet extends HttpServlet {

    Autor autor = new Autor();
    AutorDAO autorDao = new AutorDAO();
    Pessoa pessoa = new Pessoa();
    PessoaDAO pessoaDao = new PessoaDAO();
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        pessoa.setPrimeiroNome(request.getParameter("primeiroNome").trim());
        pessoa.setUltimoNome(request.getParameter("ultimoNome").trim());
        System.out.println("Nomes de pessoa em leitor"+pessoa.getPrimeiroNome()+" "+pessoa.getUltimoNome());
        int idPessoa = pessoaDao.getIDPeloNome(pessoa.getPrimeiroNome(), pessoa.getUltimoNome());
        
        System.out.println("id:"+idPessoa);
        
        autor.setFkPessoa(idPessoa);
        
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        
        autor.setDataCadastroAutor(date);
        
        autor.setPseudonimo(request.getParameter("pseudonimo").trim());
        
        autorDao.inserir(autor);
        
        System.out.println("autor cadastrado");
        response.sendRedirect("autor.jsp");

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

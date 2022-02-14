/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import conexao.TratamentoDeDatas;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.email.Email;
import modelo.email.EmailDAO;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;
import modelo.sexo.SexoDAO;
import modelo.telefone.Telefone;
import modelo.telefone.TelefoneDAO;

/**
 *
 * @author creuma
 */
@WebServlet(name = "CadastroPessoaServlet", urlPatterns = {"/CadastroPessoaServlet"})
public class CadastroPessoaServlet extends HttpServlet {

    Pessoa pessoa = new Pessoa();
    PessoaDAO pessoaDAO = new PessoaDAO();
    EmailDAO emailDao = new EmailDAO ();
    Email email = new Email();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            //TelefoneDAO telefoneDao = new TelefoneDAO ();
            //Telefone telefone = new Telefone();
            pessoa.setPrimeiroNome(request.getParameter("primeiroNome").trim());
            pessoa.setUltimoNome(request.getParameter("ultimoNome").trim());
            pessoa.setDataNasc(TratamentoDeDatas.converterDataNormalParaDataSQL(request.getParameter("dataNasc")));
            //pessoa.setFkSexo(new SexoDAO().getIDSexo(request.getParameter("sexo").trim()));
            pessoa.setNumBi(request.getParameter("numbi").trim());
            
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            
            pessoa.setDataCadastroPessoa(date);
            pessoaDAO.inserir(pessoa);
            
            System.out.println(""+ pessoa.toString());
      
            System.out.println(" Id da pessoa encontrada "+pessoaDAO.getUltimaPessoaInserida());
            int idPessoa = pessoaDAO.getUltimaPessoaInserida();
            if(idPessoa != 0){
                email.setEmail(request.getParameter("email").trim());
                emailDao.inserir(email.getEmail());
                pessoaDAO.inserirEmail(emailDao.getLastInsertedEmail());
                System.out.println("Salvou");
                response.sendRedirect("listarPessoa.jsp");
            }
            else{
                response.sendRedirect("error.jsp");
            }
            
            /*telefone.setNumTelefone(request.getParameter("telefone"));
            telefoneDao.inserir(telefone);
            pessoaDAO.inserirTelefone(telefoneDao);*/
           
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

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

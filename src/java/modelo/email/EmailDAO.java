/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.email;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;

/**
 *
 * @author creuma
 */
public class EmailDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    Pessoa pessoa = new Pessoa ();
    PessoaDAO pessoaDao = new PessoaDAO();
    Email email = new Email();
    
    public void inserir(Email email){
        
        try {
            conexao = Conexao.getConnection();
            consulta = "INSERT INTO email (email,idpessoa) values (?,?)";
            prepared = conexao.prepareStatement(consulta);
            prepared.setString(1,email.getEmail());
            prepared.setInt(2, pessoaDao.getUltimaPessoaInserida());
            prepared.executeUpdate();
            Conexao.closeConnectionPreparedStatment(conexao, prepared);
        } catch (SQLException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void inserir(String email){
        
        try {
            conexao = Conexao.getConnection();
            consulta = "INSERT INTO email (email,idpessoa) values (?,?)";
            prepared = conexao.prepareStatement(consulta);
            prepared.setString(1,email);
            prepared.setInt(2, pessoaDao.getUltimaPessoaInserida());
            prepared.executeUpdate();
            Conexao.closeConnectionPreparedStatment(conexao, prepared);
        } catch (SQLException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public int getLastInsertedEmail(int idPessoa)
    {
        ArrayList<Email> listaEmail = new ArrayList<>();
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT idemail FROM email where idpessoa = ? ORDER BY idemail DESC LIMIT 1;";
            prepared = conexao.prepareStatement(consulta);
            prepared.setInt(1, pessoaDao.getUltimaPessoaInserida());
            resultSet = prepared.executeQuery();
            
            while( resultSet.next())
            {
                return resultSet.getInt(1);
                
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
        
    }


    
}

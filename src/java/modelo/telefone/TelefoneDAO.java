/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telefone;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;

/**
 *
 * @author creuma
 */
public class TelefoneDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    Pessoa pessoa = new Pessoa ();
    PessoaDAO pessoaDao = new PessoaDAO();
    Telefone telefone = new Telefone();
    
      public void inserir(Telefone telefone){   
        
            try {
                conexao = Conexao.getConnection();
                consulta = "INSERT INTO telefone (numtelefone,idpessoa) values (?,?)";
                prepared = conexao.prepareStatement(consulta);
                prepared.setString(1,telefone.getNumTelefone());
                prepared.setInt(2, pessoaDao.getUltimaPessoaInserida());
                prepared.executeUpdate();
                Conexao.closeConnectionPreparedStatment(conexao, prepared);
            } catch (SQLException ex) {
                Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
      
      public void inserir(String telefone){   
        
            try {
                conexao = Conexao.getConnection();
                consulta = "INSERT INTO telefone (numtelefone,idpessoa) values (?,?)";
                prepared = conexao.prepareStatement(consulta);
                prepared.setString(1,telefone);
                prepared.setInt(2, pessoaDao.getUltimaPessoaInserida());
                prepared.executeUpdate();
                Conexao.closeConnectionPreparedStatment(conexao, prepared);
            } catch (SQLException ex) {
                Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

       }


      
    public String getLastInsertedNumTelefone(){
        
        String telefoneDaBd = "";
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT telefone FROM telefone where idpessoa = ? ORDER BY idtelefone DESC LIMIT 1;";
            prepared = conexao.prepareStatement(consulta);
            prepared.setInt(1, pessoaDao.getUltimaPessoaInserida());
            resultSet = prepared.executeQuery();
            telefoneDaBd = resultSet.getString(1);
            Conexao.closeConnectionResultSet(conexao, resultSet);
            return telefoneDaBd;
        
        } catch (SQLException ex) {
            Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return telefoneDaBd;
    }
    
}

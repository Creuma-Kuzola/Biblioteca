/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;
/**
 *
 * @author creuma
 */
public class Conexao {
    
   private static final String DBURL = "jdbc:postgresql://localhost:5432/biblioteca";
   private static final String USER = "postgres";
   private static final String PASSWORD = "admin";
   private static final String DRIVER = "org.postgresql.Driver";  
   static Connection  conexao = null;
    
    public static Connection getConnection() throws SQLException{
      
        try {
            
            try {
                
                Class.forName(DRIVER);
                
            } 
            catch (Exception e) {
                 System.out.println("Erro no drive "+ e.getMessage());
            }
                    
          conexao = DriverManager.getConnection(DBURL,USER, PASSWORD);
          System.out.println("Conexão realizada com sucesso");
        } 
        catch (Exception erro) {
               System.out.println("Erro na conexão "+ erro.getMessage());
        }
       
        return conexao;
    }
    
    public static void closeConnection(Connection conexao) throws SQLException
    {
        if(conexao == null)
        {
            System.out.println("Conexao invalida");    
        }   
        conexao.close();
    }        
    
    
    public static void closeConnectionResultSet(Connection conexao, ResultSet resultSet) throws SQLException
    {
        
        if(conexao == null)
        {
            System.out.println("Conexao invalida");    
        }   
        conexao.close();
        resultSet.close();
    }  
    
    public static void closeConnectionPreparedStatment(Connection conexao,PreparedStatement prepared) throws SQLException
    {
        
        if(conexao == null)
        {
            System.out.println("Conexao invalida");    
        }   
        conexao.close();
        prepared.close();
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        closeConnection(getConnection());  
        Pessoa pessoa = new Pessoa ();
        String st = "2022-01-17";
        Date data = Date.valueOf(st);
        
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoa.setIdPessoa(1);
        pessoa.setPrimeiroNome("Creuma");
        pessoa.setUltimoNome("Kuzola");
        pessoa.setDataCadastroPessoa(data);
        pessoa.setDataNasc(data);
        pessoa.setNumBi("sdfghjkghjk12347asdfghjhg");
        pessoaDAO.inserir(pessoa);
        System.out.println("Insercao realizada com sucesso");
        
    }
    
}

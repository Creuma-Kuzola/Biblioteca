/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.livro;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.sexo.Sexo;
import modelo.sexo.SexoDAO;

/**
 *
 * @author creuma
 */
public class LivroDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    
    public ArrayList<Livro> listarLivro()
    {
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT * FROM livro";
            prepared = conexao.prepareStatement(consulta);
            resultSet = prepared.executeQuery();
            ArrayList <Livro> listaLivro = new ArrayList<Livro>();
            Livro livro;
            
            while(resultSet.next())
            {
                livro = new Livro();
                livro.setTitulo(resultSet.getString("titulo"));
                livro.setIdLivro(resultSet.getInt("idlivro"));
                livro.setIsbn(resultSet.getString("isbn"));
                livro.setNumPaginas(resultSet.getInt("numpaginas"));
                listaLivro.add(livro);
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
        return listaLivro;
        
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    public int getIdLivro(String titulo)
    {
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT idlivro FROM livro WHERE titulo = ?";
            prepared = conexao.prepareStatement(consulta);
            prepared.setString(1,titulo);
            resultSet = prepared.executeQuery();
            int idLivro=0;
            
            if(resultSet.next())
            {
                idLivro = resultSet.getInt("idlivro");
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
            return idLivro; 
        
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;

    
    }        
    
}

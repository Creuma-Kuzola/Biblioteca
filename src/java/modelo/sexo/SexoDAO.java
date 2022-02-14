/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sexo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import conexao.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author creuma
 */
public class SexoDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    
    public ArrayList<Sexo> listarSexo()
    {
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT * FROM sexo";
            prepared = conexao.prepareStatement(consulta);
            resultSet = prepared.executeQuery();
            ArrayList <Sexo> listaSexo = new ArrayList<Sexo>();
            Sexo sexo;
            
            while(resultSet.next())
            {
                sexo = new Sexo();
                sexo.setIdSexo(resultSet.getInt("idsexo"));
                sexo.setDesignacao(resultSet.getString("designacao"));
                listaSexo.add(sexo);
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
        return listaSexo;
        
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public int getIDSexo(String designacaoSexo)
    {
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT idsexo FROM sexo WHERE designacao = ?";
            prepared = conexao.prepareStatement(consulta);
            prepared.setString(1,designacaoSexo);
            resultSet = prepared.executeQuery();
            int idSexo=0;
            
            if(resultSet.next())
            {
                idSexo = resultSet.getInt("idsexo");
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
            return idSexo; 
        
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;

    
    }        
    
}

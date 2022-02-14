/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.comuna;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.provincia.Provincia;
import modelo.provincia.ProvinciaDAO;

/**
 *
 * @author creuma
 */
public class ComunaDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    
    public ArrayList<Comuna> listarComunas()
    {
        try {
            
            conexao = Conexao.getConnection();
            consulta = "SELECT * FROM comuna";
            prepared = conexao.prepareStatement(consulta);
            resultSet = prepared.executeQuery();
            ArrayList <Comuna> listaComunas = new ArrayList<Comuna>();
            Comuna comuna;
            
            while(resultSet.next())
            {
                comuna = new Comuna();
                comuna.setIdComuna(resultSet.getInt("idcomuna"));
                comuna.setNomeComuna(resultSet.getString("nomecomuna"));
                listaComunas.add(comuna);
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
            return listaComunas;
        
        } catch (SQLException ex) {
            Logger.getLogger(ComunaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    
}

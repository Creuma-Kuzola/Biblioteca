/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.provincia;

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
public class ProvinciaDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    
    public ArrayList<Provincia> listarProvincias()
    {
        try {
            
            conexao = Conexao.getConnection();
            consulta = "SELECT * FROM provincia";
            prepared = conexao.prepareStatement(consulta);
            resultSet = prepared.executeQuery();
            ArrayList <Provincia> listaProvincia = new ArrayList<Provincia>();
            Provincia provincia;
            
            while(resultSet.next())
            {
                provincia = new Provincia();
                provincia.setIdProvincia(resultSet.getInt("idprovincia"));
                provincia.setNomeProvincia(resultSet.getString("nomeprovincia"));
                listaProvincia.add(provincia);
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
            return listaProvincia;
        
        } catch (SQLException ex) {
            Logger.getLogger(ProvinciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    
}

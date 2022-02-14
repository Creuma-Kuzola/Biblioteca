/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.municipio;

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
public class MunicipioDAO {
 
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultSet = null;
    
    public ArrayList<Municipio> listarMunicipios()
    {
        try {
            
            conexao = Conexao.getConnection();
            consulta = "SELECT * FROM municipio";
            prepared = conexao.prepareStatement(consulta);
            resultSet = prepared.executeQuery();
            ArrayList <Municipio> listaMunicipio = new ArrayList<Municipio>();
            Municipio municipio;
            
            while(resultSet.next())
            {
                municipio = new Municipio();
                municipio.setIdMunicipio(resultSet.getInt("idmunicipio"));
                municipio.setNomeMunicipio(resultSet.getString("nomemunicipio"));
                listaMunicipio.add(municipio);
            }    
            Conexao.closeConnectionResultSet(conexao, resultSet);
            return listaMunicipio;
        
        } catch (SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.municipio;

/**
 *
 * @author creuma
 */
public class Municipio {
    
    private int idMunicipio;
    private String nomeMunicipio;
    private int fkProvincia;

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public int getFkProvincia() {
        return fkProvincia;
    }

    public void setFkProvincia(int fkProvincia) {
        this.fkProvincia = fkProvincia;
    }
    
    
}

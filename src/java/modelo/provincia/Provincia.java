/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.provincia;

/**
 *
 * @author creuma
 */
public class Provincia {
    
    private int idProvincia;
    private String nomeProvincia;
    private int fkPais;

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNomeProvincia() {
        return nomeProvincia;
    }

    public void setNomeProvincia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
    }

    public int getFkPais() {
        return fkPais;
    }

    public void setFkPais(int fkPais) {
        this.fkPais = fkPais;
    }
    
    
}

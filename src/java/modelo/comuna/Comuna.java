/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.comuna;

/**
 *
 * @author creuma
 */
public class Comuna {
  
    private int idComuna;
    private String nomeComuna;
    private int fkMunicipio;

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNomeComuna() {
        return nomeComuna;
    }

    public void setNomeComuna(String nomeComuna) {
        this.nomeComuna = nomeComuna;
    }

    public int getFkMunicipio() {
        return fkMunicipio;
    }

    public void setFkMunicipio(int fkMunicipio) {
        this.fkMunicipio = fkMunicipio;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idComuna=" + idComuna + ", nomeComuna=" + nomeComuna + ", fkMunicipio=" + fkMunicipio + '}';
    }
    
   
}

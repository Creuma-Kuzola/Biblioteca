/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.morada;

/**
 *
 * @author creuma
 */
public class Morada {
    
    private int idMorada;
    private String rua;
    private int numCasa;
    private int fkBairro;

    public int getIdMorada() {
        return idMorada;
    }

    public void setIdMorada(int idMorada) {
        this.idMorada = idMorada;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public int getFkBairro() {
        return fkBairro;
    }

    public void setFkBairro(int fkBairro) {
        this.fkBairro = fkBairro;
    }
    
    
}

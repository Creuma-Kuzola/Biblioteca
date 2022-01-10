/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bairro;

/**
 *
 * @author creuma
 */
public class Bairro {
    
    private int idBairro;
    private String nomeBairro;
    private int fkComuna;

    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public int getFkComuna() {
        return fkComuna;
    }

    public void setFkComuna(int fkComuna) {
        this.fkComuna = fkComuna;
    }
    
}

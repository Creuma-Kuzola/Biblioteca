/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telefone;

/**
 *
 * @author creuma
 */
public class Telefone {
 
    private int idTelefone;
    private String numTelefone;
     private int fkIdPessoa;

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public int getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(int fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    @Override
    public String toString() {
        return "Telefone{" + "idTelefone=" + idTelefone + ", numTelefone=" + numTelefone + ", fkIdPessoa=" + fkIdPessoa + '}';
    }
    
    
}

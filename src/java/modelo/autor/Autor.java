/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.autor;

import java.sql.Date;

/**
 *
 * @author creuma
 */
public class Autor {
   
    private int idAutor;
    private int fkPessoa;
    private String pseudonimo;
    private Date dataCadastroAutor;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    public Date getDataCadastroAutor() {
        return dataCadastroAutor;
    }

    public void setDataCadastroAutor(Date dataCadastroAutor) {
        this.dataCadastroAutor = dataCadastroAutor;
    }
    
}

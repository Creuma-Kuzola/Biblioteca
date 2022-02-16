/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.leitor;

import java.sql.Date;

/**
 *
 * @author creuma
 */
public class Leitor {
    
    private int idLeitor;
    private int fkPessoa;
    private Date dataCadastroLeitor;

    public int getIdLeitor() {
        return idLeitor;
    }

    public void setIdLeitor(int idLeitor) {
        this.idLeitor = idLeitor;
    }

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    public Date getDataCadastroLeitor() {
        return dataCadastroLeitor;
    }

    public void setDataCadastroLeitor(Date dataCadastroLeitor) {
        this.dataCadastroLeitor = dataCadastroLeitor;
    }
    
    
}

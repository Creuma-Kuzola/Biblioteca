/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.requisicao;

/**
 *
 * @author creuma
 */
public class Requisicao {
    
    private int idRequisicao;
    private int fkLivro;
    private int fkLeitor;
    private String dataRequisicao;
    private String dataEntrega;

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public int getFkLivro() {
        return fkLivro;
    }

    public void setFkLivro(int fkLivro) {
        this.fkLivro = fkLivro;
    }

    public int getFkLeitor() {
        return fkLeitor;
    }

    public void setFkLeitor(int fkLeitor) {
        this.fkLeitor = fkLeitor;
    }

    public String getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(String dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    
}

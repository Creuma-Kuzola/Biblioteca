/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.editora;

/**
 *
 * @author creuma
 */
public class Editora {
    
    private int idEditora;
    private String nome;
    private int fkTelefone;
    private String fax;
    private int fkEmail;
    private int fkMorada;
    private String dataCadastroEditora;

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFkTelefone() {
        return fkTelefone;
    }

    public void setFkTelefone(int fkTelefone) {
        this.fkTelefone = fkTelefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getFkEmail() {
        return fkEmail;
    }

    public void setFkEmail(int fkEmail) {
        this.fkEmail = fkEmail;
    }

    public int getFkMorada() {
        return fkMorada;
    }

    public void setFkMorada(int fkMorada) {
        this.fkMorada = fkMorada;
    }

    public String getDataCadastroEditora() {
        return dataCadastroEditora;
    }

    public void setDataCadastroEditora(String dataCadastroEditora) {
        this.dataCadastroEditora = dataCadastroEditora;
    }
    
}

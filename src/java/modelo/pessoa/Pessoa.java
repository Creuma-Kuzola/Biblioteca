/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pessoa;

/**
 *
 * @author creuma
 */
public class Pessoa {
    
    private int idPessoa;
    private String primeiroNome;
    private String ultimoNome;
    private int fkTelefone;
    private String numBi;
    private String dataNasc;
    private int fkEmail;
    private int fkMorada;
    private int fkSexo;
    private String dataCadastroPessoa;

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public int getFkTelefone() {
        return fkTelefone;
    }

    public void setFkTelefone(int fkTelefone) {
        this.fkTelefone = fkTelefone;
    }

    public String getNumBi() {
        return numBi;
    }

    public void setNumBi(String numBi) {
        this.numBi = numBi;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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

    public int getFkSexo() {
        return fkSexo;
    }

    public void setFkSexo(int fkSexo) {
        this.fkSexo = fkSexo;
    }

    public String getDataCadastroPessoa() {
        return dataCadastroPessoa;
    }

    public void setDataCadastroPessoa(String dataCadastroPessoa) {
        this.dataCadastroPessoa = dataCadastroPessoa;
    }
    
}

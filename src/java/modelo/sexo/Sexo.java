/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sexo;

/**
 *
 * @author creuma
 */
public class Sexo {
    
    private int idSexo;
    private String designacao;

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    @Override
    public String toString() {
        return "Sexo{" + "idSexo=" + idSexo + ", designacao=" + designacao + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.livroeditora;

/**
 *
 * @author creuma
 */
public class LivroEditora {
    
    private int fkLivro;
    private int fkEditora;

    public int getFkLivro() {
        return fkLivro;
    }

    public void setFkLivro(int fkLivro) {
        this.fkLivro = fkLivro;
    }

    public int getFkEditora() {
        return fkEditora;
    }

    public void setFkEditora(int fkEditora) {
        this.fkEditora = fkEditora;
    }
    
    
}

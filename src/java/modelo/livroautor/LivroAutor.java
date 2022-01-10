/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.livroautor;

/**
 *
 * @author creuma
 */
public class LivroAutor {
    
    private int fkAutor;
    private int fkLivro;

    public int getFkAutor() {
        return fkAutor;
    }

    public void setFkAutor(int fkAutor) {
        this.fkAutor = fkAutor;
    }

    public int getFkLivro() {
        return fkLivro;
    }

    public void setFkLivro(int fkLivro) {
        this.fkLivro = fkLivro;
    }
    
}

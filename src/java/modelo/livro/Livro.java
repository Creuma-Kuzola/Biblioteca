/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.livro;

/**
 *
 * @author creuma
 */
public class Livro {
 
    private int idLivro;
    private String titulo;
    private String isbn;
    private int numPaginas;
    private String dataCadastroLivro;
    private int fkEstado;
    private int fkClassificacao;
    private int fkDescritor;
    private int fkLocalizacao;
    private int fkEdicao;

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getDataCadastroLivro() {
        return dataCadastroLivro;
    }

    public void setDataCadastroLivro(String dataCadastroLivro) {
        this.dataCadastroLivro = dataCadastroLivro;
    }

    public int getFkEstado() {
        return fkEstado;
    }

    public void setFkEstado(int fkEstado) {
        this.fkEstado = fkEstado;
    }

    public int getFkClassificacao() {
        return fkClassificacao;
    }

    public void setFkClassificacao(int fkClassificacao) {
        this.fkClassificacao = fkClassificacao;
    }

    public int getFkDescritor() {
        return fkDescritor;
    }

    public void setFkDescritor(int fkDescritor) {
        this.fkDescritor = fkDescritor;
    }

    public int getFkLocalizacao() {
        return fkLocalizacao;
    }

    public void setFkLocalizacao(int fkLocalizacao) {
        this.fkLocalizacao = fkLocalizacao;
    }

    public int getFkEdicao() {
        return fkEdicao;
    }

    public void setFkEdicao(int fkEdicao) {
        this.fkEdicao = fkEdicao;
    }
    
    
}

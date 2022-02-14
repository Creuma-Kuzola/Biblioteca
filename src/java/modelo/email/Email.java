/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.email;

/**
 *
 * @author creuma
 */
public class Email {
    
    private int idEmail;
    private String email;
    private int fkIDPessoa;

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getFkIDPessoa() {
        return fkIDPessoa;
    }

    public void setFkIDPessoa(int fkIDPessoa) {
        this.fkIDPessoa = fkIDPessoa;
    }

    @Override
    public String toString() {
        return "Email{" + "idEmail=" + idEmail + ", email=" + email + ", fkIDPessoa=" + fkIDPessoa + '}';
    }
     
    
}

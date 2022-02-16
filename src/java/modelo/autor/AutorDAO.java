/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.autor;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.leitor.Leitor;
import modelo.leitor.LeitorDAO;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;
import modelo.sexo.SexoDAO;

/**
 *
 * @author creuma
 */
public class AutorDAO {
    
    private static Connection conexao;
        private String consulta;
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        Pessoa pessoa = new Pessoa ();
        PessoaDAO pessoaDao = new PessoaDAO();

        public void inserir(Autor autor)  {

            try {
                conexao = Conexao.getConnection();
                consulta = "INSERT INTO autor (fkpessoa,pseudonimo,datacadastroautor) values (?,?,?)";
                System.out.println(consulta);
                prepared = conexao.prepareStatement(consulta);
                prepared.setInt(1, autor.getFkPessoa());
                prepared.setString(2, autor.getPseudonimo());
                prepared.setDate(3, autor.getDataCadastroAutor());
                prepared.executeUpdate();
                Conexao.closeConnectionPreparedStatment(conexao, prepared);
            } catch (SQLException ex) {
                Logger.getLogger(LeitorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

         }
    
    public ArrayList<Pessoa> listarAutor()
    {
        try {
            conexao = Conexao.getConnection();
            consulta = "select * from pessoa inner join autor on pessoa.idpessoa = autor.fkpessoa;";
            prepared = conexao.prepareStatement(consulta);
            resultSet = prepared.executeQuery();
            ArrayList <Pessoa> listaLeitor = new ArrayList<>();
            Pessoa pessoaItem;
            
            while(resultSet.next())
            {
                pessoaItem = new Pessoa();
                pessoaItem = new Pessoa();
                pessoaItem.setPrimeiroNome(resultSet.getString("primeironome"));
                pessoaItem.setUltimoNome(resultSet.getString("ultimonome"));
                pessoaItem.setIdPessoa(resultSet.getInt("idpessoa"));
                pessoaItem.setNumBi(resultSet.getString("numbi"));
                pessoaItem.setDataNasc(resultSet.getDate("datanasc"));
                listaLeitor.add(pessoaItem);
                
            }    
        Conexao.closeConnectionResultSet(conexao, resultSet);
        return listaLeitor;
        
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}

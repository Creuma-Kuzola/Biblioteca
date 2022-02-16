/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.leitor;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.email.Email;
import modelo.pessoa.Pessoa;
import modelo.pessoa.PessoaDAO;
import modelo.sexo.Sexo;
import modelo.sexo.SexoDAO;

/**
 *
 * @author creuma
 */
public class LeitorDAO {
    
        private static Connection conexao;
        private String consulta;
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        Pessoa pessoa = new Pessoa ();
        PessoaDAO pessoaDao = new PessoaDAO();

        public void inserir(Leitor leitor)  {

            try {
                conexao = Conexao.getConnection();
                consulta = "INSERT INTO leitor (fkpessoa,datacadastroleitor) values (?,?)";
                System.out.println(consulta);
                prepared = conexao.prepareStatement(consulta);
                prepared.setInt(1, leitor.getFkPessoa());
                prepared.setDate(2, leitor.getDataCadastroLeitor());
                prepared.executeUpdate();
                Conexao.closeConnectionPreparedStatment(conexao, prepared);
            } catch (SQLException ex) {
                Logger.getLogger(LeitorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

         }
    
    public ArrayList<Pessoa> listarLeitor()
    {
        try {
            conexao = Conexao.getConnection();
            consulta = "select * from pessoa inner join leitor on pessoa.idpessoa = leitor.fkpessoa;";
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

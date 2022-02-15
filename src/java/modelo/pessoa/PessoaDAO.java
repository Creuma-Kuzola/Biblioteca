/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pessoa;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.email.Email;
import modelo.email.EmailDAO;
import modelo.sexo.SexoDAO;
import modelo.telefone.TelefoneDAO;

/**
 *
 * @author creuma
 */
public class PessoaDAO {
    
    private static Connection conexao;
    private String consulta;
    PreparedStatement prepared = null;
    ResultSet resultset = null;
    Pessoa pessoa = new Pessoa();
    //EmailDAO emailDao = new EmailDAO();
    //TelefoneDAO telefoneDao = new TelefoneDAO();
    
    public void inserir (Pessoa pessoa) throws SQLException {
       
        conexao = Conexao.getConnection();
        consulta = "INSERT INTO pessoa (primeironome,ultimonome,numbi"
                + ",datanasc,datacadastropessoa) values (?,?,"
                + "?,?,?)";
        System.out.println(consulta);
        prepared = conexao.prepareStatement(consulta);
        prepared.setString(1,pessoa.getPrimeiroNome());
        prepared.setString(2, pessoa.getUltimoNome());
        prepared.setString(3, pessoa.getNumBi());
        prepared.setDate(4,pessoa.getDataNasc());
        prepared.setDate(5,pessoa.getDataCadastroPessoa());
        prepared.executeUpdate();
        Conexao.closeConnectionPreparedStatment(conexao, prepared);
        
    }
    
    public int getUltimaPessoaInserida()
    {
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        
        try
        {
            conexao = Conexao.getConnection();
            consulta = "SELECT idpessoa FROM pessoa ORDER BY idpessoa DESC LIMIT 1;";
            prepared = conexao.prepareStatement(consulta);
            resultset = prepared.executeQuery();
            
            while( resultset.next())
            {

                pessoa.setIdPessoa(resultset.getInt(1));
                
                System.out.println("Valor encontrado  na pessoa+" +pessoa.getIdPessoa());
                
                listaPessoa.add(pessoa);
                return pessoa.getIdPessoa();
                
            }
        }
        catch(SQLException ex)
        {
            System.out.println("Erro ao pegar a última pessoa inserida"+ex.toString());
        }
        
        return -1;
    }
    
    
    public void inserirEmail(int idEmail){
    
        try {
            conexao = Conexao.getConnection();
            consulta = "UPDATE pessoa SET fkemail = "+idEmail+ " WHERE idpessoa = "+ getUltimaPessoaInserida()+" ;";
            System.out.println(consulta);
            System.out.println("Em inserir email: "+idEmail+ " "+ getUltimaPessoaInserida());
            prepared = conexao.prepareStatement(consulta);
            prepared.execute();
            Conexao.closeConnectionPreparedStatment(conexao, prepared);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Pessoa> listarPessoas(){
    
           
        try {
            conexao = Conexao.getConnection();
            consulta = "SELECT * FROM pessoa";
            prepared = conexao.prepareStatement(consulta);
            resultset = prepared.executeQuery();
            ArrayList <Pessoa> listaPessoa = new ArrayList<Pessoa>();
            Pessoa pessoaItem;
            
            while(resultset.next())
            {
                pessoaItem = new Pessoa();
                pessoaItem.setPrimeiroNome(resultset.getString("primeironome"));
                pessoaItem.setUltimoNome(resultset.getString("ultimonome"));
                pessoaItem.setIdPessoa(resultset.getInt("idpessoa"));
                pessoaItem.setNumBi(resultset.getString("numbi"));
                pessoaItem.setDataNasc(resultset.getDate("datanasc"));
                listaPessoa.add(pessoaItem);
            }
            Conexao.closeConnectionResultSet(conexao, resultset);
            return listaPessoa;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
   /* public void inserirTelefone(TelefoneDAO telefoneDao){
        
        try {
            conexao = Conexao.getConnection();
            consulta = "INSERT INTO pessoa (fktelefone) values (?)";
            System.out.println(consulta);
            prepared = conexao.prepareStatement(consulta);
            prepared.setString(1,telefoneDao.getLastInsertedNumTelefone());
            prepared.executeUpdate();
            Conexao.closeConnectionPreparedStatment(conexao, prepared);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }*/
    
    
}

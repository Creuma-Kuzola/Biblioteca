<%-- 
    Document   : pessoa
    Created on : Jan 25, 2022, 3:50:00 PM
    Author     : creuma
--%>

<%@page import="modelo.pessoa.Pessoa"%>
<%@page import="modelo.pessoa.PessoaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pessoa</title>
        <link rel="stylesheet" href="css/cadastropessoa.css">
    </head>
    <body>

         <header class="header-div">
            <nav class="nav-div">
                <input type="search" placeholder="pesquisar">
            </nav>
        </header>
        <section class="section-div">
            <h1 class="h1-nome-biblioteca">Leia-Biblioteca</h1>
            <ul class="ul-div">
                <li> <a href="index.jsp">Index</a></li>
                <li> <a href="#">Pessoa</a></li>
                <li> <a href="cadastroLeitor.jsp">Leitor</a> </li>
                <li> <a href="cadastroAutor.jsp">Autor</a></li>
                <li><a href="">Editora</a></li>
                <li><a href="cadastroLivro.jsp">Livro</a></li>
                <li><a href="cadastroRequisicao.jsp">Requisação</a></li>
              
            </ul>
        </section>
                <button onclick="window.location.href='cadastroPessoa.jsp'" class="btn-nova-pessoa">Nova Pessoa</button>
        <section class="main-section"> 
          <table width="100%" class="table-main"> 
                <thead>
                    <tr>
                        <td> Id Pessoa </td>
                        <td> Primeiro Nome </td>
                        <td> Último Nome </td>
                        <td> Numbi </td>
                        <td> Data de Nascimento </td>       
                    </tr>
                </thead> 

                <%
                     PessoaDAO pessoaDao = new PessoaDAO();
                     ArrayList<Pessoa> listaPessoas = pessoaDao.listarPessoas();
                         
                     for(Pessoa pessoa : listaPessoas)
                     {
                 %>   
                 <tbody>
                    <tr>
                        <td><%= pessoa.getIdPessoa() %></td>
                        <td><%= pessoa.getPrimeiroNome() %> </td>
                        <td><%= pessoa.getUltimoNome() %> </td>
                        <td><%= pessoa.getNumBi() %> </td>
                        <td><%= pessoa.getDataNasc() %> </td>
                        <td><a href="editarPessoa">Editar</a></td>
                        <td><a href="eliminarPessoa">Eliminar</a></td>
                    </tr>  
                 </tbody>
                  <%
                    
                    }
                               
                   %>
          </table>
        </section>
    </body>
</html>

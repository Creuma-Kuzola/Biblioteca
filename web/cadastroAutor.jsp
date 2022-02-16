<%-- 
    Document   : cadastroAutor
    Created on : Feb 14, 2022, 7:55:38 PM
    Author     : creuma
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.pessoa.Pessoa"%>
<%@page import="modelo.pessoa.PessoaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Autor</title>
        <link rel="stylesheet" href="css/cadastroautor.css">
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
                <li> <a href="pessoa.jsp">Pessoa</a></li>
                <li> <a href="leitor.jsp">Leitor</a> </li>
                <li> <a href="#">Autor</a></li>
                <li><a href="editora.jsp">Editora</a></li>
                <li><a href="livro.jsp">Livro</a></li>
                <li><a href="requisicao.jsp">Requisação</a></li>
              
            </ul>
        </section>
            <section class="main-section">
                <h1 class="h1-title-form">Cadastro do Autor</h1>
                <form action="CadastroAutorServlet" method="post" class="form-cadastro">
                    
                    <label>Autor:</label>   <br>
                    <label>Primeiro Nome</label>
                    <select name="primeiroNome">
                        <%
                            PessoaDAO pessoaDao = new PessoaDAO();
                            ArrayList<Pessoa> listaPessoa = pessoaDao.listarPessoas();
                            if(listaPessoa!= null){
                                for(Pessoa pessoa:listaPessoa)
                                {
                                    %> <option> <%= pessoa.getPrimeiroNome() %> </option> <%
                                }
                            }

                        %>
                    </select>
                    <label>Último Nome</label>
                     <select name="ultimoNome">
                        <%
                            
                            if(listaPessoa!= null){
                                for(Pessoa pessoa:listaPessoa)
                                {
                                    %> <option> <%= pessoa.getUltimoNome() %> </option> <%
                                }
                            }

                        %>
                    </select><br><br>
                    
                    <label>Pseudónimo</label>
                    <input type="text" name="pseudonimo">
                    
                    <button onclick="window.location.href='autor.jsp'" class="btn-cancelar">Cancelar</button>
                    <input type="submit" onclick="window.location.href='autor.jsp'" value="Cadastrar" class="btn-cadastrar">
   
                </form> <br><br>
       
        </section>
    </body>
</html>

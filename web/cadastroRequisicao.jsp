<%-- 
    Document   : cadastroRequisicao
    Created on : Feb 14, 2022, 7:56:38 PM
    Author     : creuma
--%>

<%@page import="modelo.livro.Livro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.livro.LivroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/cadastrorequisicao.css">
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
                <li> <a href="autor.jsp">Autor</a></li>
                <li><a href="editora.jsp">Editora</a></li>
                <li><a href="livro.jsp">Livro</a></li>
                <li><a href="#">Requisação</a></li>
            </ul>
        </section>
        
        </section>
            <section class="main-section">
                <h1 class="h1-title-form">Cadastro da Pessoa</h1>
                <form action="CadastroPessoaServlet" method="post" class="form-cadastro">
                    <label>Primeiro Nome</label>
                    <input type="text" name="primeiroNome" required/> <br><br>
                    <label>Ultimo Nome</label>
                    <input type="text" name="ultimoNome" required/><br><br>

                    <label>Data da Requisicao</label>
                    <input type="date" name="dataNasc" required/><br><br>
                    
                    <label>Data da Entrega</label>
                    <input type="date" name="dataNasc" required/><br><br>


                    <label>Livro</label> <br>
                    <select name="livro">
                        <%
                            LivroDAO livroDao = new LivroDAO();
                            ArrayList<Livro> listaLivro = livroDao.listarLivro();
                            if(listaLivro!= null){
                                for(Livro livro:listaLivro)
                                {
                                    %> <option> <%= livro.getTitulo() %> </option> <%
                                }
                            }

                        %>
                    </select> <br>
                   
                    
                    <button onclick="window.location.href='livro.jsp'" class="btn-cancelar">Cancelar</button>
                    <input type="submit" onclick="window.location.href='livro.jsp'" value="Cadastrar" class="btn-cadastrar">
   
                </form> <br><br>
       
        </section>
        
        
    </body>
</html>

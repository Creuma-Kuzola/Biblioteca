<%-- 
    Document   : livro      
    Created on : Feb 12, 2022, 1:34:43 PM
    Author     : creuma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Livro</title>
        <link rel="stylesheet" href="css/livro.css">
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
                <li><a href="#"></a></li>
                <li><a href="requisicao.jsp">Requisação</a></li>
              
            </ul>
        </section>

        <button onclick="window.location.href='cadastroLivro.jsp'" class="btn-nova-pessoa">Novo livro</button>
        <section class="main-section"> 
          <table width="100%" class="table-main"> 
                <thead>
                    <tr>
                        <td> Id Livro </td>
                        <td> Titulo </td>
                        <td>ISBN</td>
                        <td> Numero de Paginas</td>
                        <td>Estado</td>    
                        <td>Classificacao</td>
                        <td>Descritor</td>
                        <td>Localizacao</td>
                        <td>Edicao</td>
                    </tr>
                </thead> 

              <%--  <%
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
                               
                   %>--%>
          </table>
        </section>

    </body>
</html>

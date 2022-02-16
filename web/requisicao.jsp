<%-- 
    Document   : requisicao
    Created on : Feb 15, 2022, 10:31:10 AM
    Author     : creuma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Requisicao</title>
        <link rel="stylesheet" href="css/requisicao.css">
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
        <button onclick="window.location.href='cadastroRequisicao.jsp'" class="btn-nova-pessoa">Nova Requisicao</button>
        <section class="main-section"> 
          <table width="100%" class="table-main"> 
                <thead>
                    <tr>
                        <td> Id Requisicao </td>
                        <td> Titulo do livro </td>
                        <td>Primeiro Nome do leitor </td>
                        <td>Ultimo Nome do leitor </td>
                        <td> Data da requisicao </td>
                        <td> Data de entrega </td> 
                        <td>Entregou</td>
                    </tr>
                </thead> 

                <%--   <%
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
          </table>--%>
        </section>
    </body>
</html>

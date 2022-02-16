<%-- 
    Document   : leitor
    Created on : Feb 15, 2022, 8:29:21 AM
    Author     : creuma
--%>

<%@page import="modelo.leitor.LeitorDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.pessoa.Pessoa"%>
<%@page import="modelo.pessoa.PessoaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/leitor.css"
        <title>Leitor</title>
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
                <li><a href="requisicao.jsp">Requisação</a></li>
            </ul>
        </section>

        <button onclick="window.location.href='cadastroLeitor.jsp'" class="btn-nova-pessoa">Novo Leitor</button>
        <section class="main-section"> 
          <table width="100%" class="table-main"> 
                <thead>
                    <tr>
                        <td> Id Leitor </td>
                        <td> Primeiro </td>
                        <td> Último Nome </td>     
                    </tr>
                </thead> 

                <%
                     LeitorDAO leitorDao = new LeitorDAO();
                     ArrayList<Pessoa> listaPessoas = leitorDao.listarLeitor();
                         
                     for(Pessoa pessoa : listaPessoas)
                     {
                 %>   
                 <tbody>
                    <tr>
                        <td><%= pessoa.getIdPessoa() %></td>
                        <td><%= pessoa.getPrimeiroNome() %> </td>
                        <td><%= pessoa.getUltimoNome() %> </td>
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

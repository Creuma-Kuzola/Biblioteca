<%-- 
    Document   : cadastroEditora
    Created on : Feb 15, 2022, 1:08:19 AM
    Author     : creuma
--%>

<%@page import="modelo.comuna.ComunaDAO"%>
<%@page import="modelo.comuna.Comuna"%>
<%@page import="modelo.municipio.Municipio"%>
<%@page import="modelo.municipio.MunicipioDAO"%>
<%@page import="modelo.provincia.Provincia"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.provincia.ProvinciaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Editora</title>
        <link rel="stylesheet" href="css/cadastroeditora.css">
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
                <li><a href="#">Editora</a></li>
                <li><a href="livro.jsp">Livro</a></li>
                <li><a href="requisicao.jsp">Requisação</a></li>
              
            </ul>
        </section>
            <section class="main-section">
                <h1 class="h1-title-form">Cadastro da Editora</h1>
                <form action="CadastroPessoaServlet" method="post" class="form-cadastro">
                    <label>Nome</label>
                    <input type="text" name="Nome" required/> <br><br>
                    
                    <label>Telefone</label>
                    <input type="text" required name="telefone"><br><br>

                    <label>Fax</label>
                    <input type="text" required name="fax"><br><br>

                    <label>Email</label>
                    <input type="email" required name="email"<br><br><br>

                    <label>Morada</label>

                    <label>Provincia</label>
                    <select name="provincia">
                        <%  
                           ProvinciaDAO provinciaDao = new ProvinciaDAO();
                           ArrayList<Provincia> listaProvincia = provinciaDao.listarProvincias();


                                for(Provincia provincia:listaProvincia)
                                {
                                    %> <option> <%= provincia.getNomeProvincia() %> </option> <%
                                }
                        %>
                    </select>

                    <label>Municipio</label>
                    <select name="municipio">
                        <%  
                           MunicipioDAO municipioDao = new MunicipioDAO();
                           ArrayList<Municipio> listaMunicipio = municipioDao.listarMunicipios();

                            if(listaMunicipio != null){
                                for(Municipio municipio:listaMunicipio)
                                {
                                    %> <option> <%= municipio.getNomeMunicipio() %> </option> <%
                                }

                            }
                        %>

                    </select>

                    <label>Comuna</label>
                    <select name="comuna">
                        <%  
                           ComunaDAO comunaDao = new ComunaDAO();
                           ArrayList<Comuna> listaComunas = comunaDao.listarComunas();

                            if(listaComunas != null){
                                for(Comuna comuna:listaComunas)
                                {
                                    %> <option> <%= comuna.getNomeComuna() %> </option> <%
                                }

                            }
                        %>
                    </select><br><br>
                    <button onclick="window.location.href='editora.jsp'" class="btn-cancelar">Cancelar</button>
                    <input type="submit" onclick="window.location.href='editora.jsp'" value="Cadastrar" class="btn-cadastrar">
   
                </form> <br><br>
       
        </section>

    </body>
</html>

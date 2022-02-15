<%-- 
    Document   : pessoa
    Created on : Jan 25, 2022, 3:50:00 PM
    Author     : creuma
--%>

<%@page import="modelo.comuna.Comuna"%>
<%@page import="modelo.comuna.ComunaDAO"%>
<%@page import="modelo.municipio.Municipio"%>
<%@page import="modelo.municipio.MunicipioDAO"%>
<%@page import="modelo.provincia.Provincia"%>
<%@page import="modelo.provincia.ProvinciaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.sexo.Sexo"%>
<%@page import="modelo.sexo.SexoDAO"%>
<%@page import="modelo.pessoa.Pessoa"%>
<%@page import="modelo.pessoa.PessoaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Cadastro Pessoa</title>
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
            <section class="main-section">
                <h1 class="h1-title-form">Cadastro da Pessoa</h1>
                <form action="CadastroPessoaServlet" method="post" class="form-cadastro">
                    <label>Primeiro Nome</label>
                    <input type="text" name="primeiroNome" required/> <br><br>
                    <label>Ultimo Nome</label>
                    <input type="text" name="ultimoNome" required/><br><br>

                    <label>Data de Nascimento</label>
                    <input type="date" name="dataNasc" required/><br><br>

                    <label>Sexo</label>
                    <select name="sexo">
                        <%
                            SexoDAO sexoDao = new SexoDAO();
                            ArrayList<Sexo> listaSexo = sexoDao.listarSexo();
                            if(listaSexo!= null){
                                for(Sexo sexo:listaSexo)
                                {
                                    %> <option> <%= sexo.getDesignacao() %> </option> <%
                                }
                            }

                        %>
                    </select><br><br>

                    <label>Telefone</label>
                    <input type="text" required name="telefone"><br><br>

                    <label>Numero do BI</label>
                    <input type="text" required name="numbi"><br><br>

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
                    <button onclick="window.location.href='pessoa.jsp'" class="btn-cancelar">Cancelar</button>
                    <input type="submit" onclick="window.location.href='pessoa.jsp'" value="Cadastrar" class="btn-cadastrar">
   
                </form> <br><br>
       
        </section>
    </body>
</html>

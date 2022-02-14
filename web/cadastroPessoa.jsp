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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <header>
            
        </header>
        <form action="CadastroPessoaServlet" method="post">
            <label>Primeiro Nome</label>
            <input type="text" name="primeiroNome" required/> <br>
            <label>Ultimo Nome</label>
            <input type="text" name="ultimoNome" required/><br>
            
            <label>Data de Nascimento</label>
            <input type="date" name="dataNasc" required/><br>
            
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
            </select><br>
            
            <label>Telefone</label>
            <input type="text" required name="telefone"><br>
            
            <label>Numero do BI</label>
            <input type="text" required name="numbi"><br>
            
            <label>Email</label>
            <input type="email" required name="email"<br><br>
            
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
           
            <input type="submit" value="Enviar">
            
        </form>
    </body>
</html>

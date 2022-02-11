<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark btn-primary mb-5">
  <a class="navbar-brand" href="#">Tabela Veículos</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Veículos</a>
      </li>
     
    </ul>
  </div>
</nav>

<div class="container">
		<div class="row justify-content-center">
	      <h1 class= col-8 >Lista de Automóveis</h1>
	      <hr>
	     </div>
	     <a href="formulario.jsp"><button type="button" class="btn btn-primary mb-3" name="option" value="form" >Cadastrar veículo</button></a>
	     
</div>


<div class="container">

<table class="table table-bordered" >
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Placa</th>
      <th scope="col">Modelo</th>
      <th scope="col">Marca</th>
      <th scope="col">Ano</th>
      <th scope="col">Ipva</th>
      <th scope="col">Alterar</th>
      <th scope="col">Deletar</th>
    </tr>
  </thead>
  
  <tbody>
  
	<c:forEach items="${listagemVeiculo}" var="auto" varStatus="i">
			  
		<tr>
		 <form method="post" action="ServletTrabalhoFinal" class="text-start">
			 
			 	<td>
					<c:out value="${auto.id}"/>
				<input type="hidden" name="id" value="${auto.id}"/>
				</td>
				<td><c:out value="${auto.placa}"/></td>
				<td><c:out value="${auto.modelo}"/></td>
				<td><c:out value="${auto.marca}"/></td>
				<td><c:out value="${auto.ano}"/></td>
			 	<td><c:out value=""/></td>
			 
			 
			 
			 
			
			 
			 <td><button type="submit" class="btn btn-primary mb-3" name="option" value="editar"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
</svg></button></td>
<td><button type="submit" class="btn btn-primary mb-3" name="option" value="deletar"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
  <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
  <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
</svg></button></td>
			 </form>
		</tr>
	</c:forEach>

  
  </tbody>
</table>
</div>
</body>
</html>
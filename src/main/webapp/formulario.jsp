<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
<title>Insert title here</title>

</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-5">
  <a class="navbar-brand" href="#">Drogasil</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Veículo</a>
      </li>
     
    </ul>
  </div>
</nav>
<div class="container">
<div class="row justify-content-center">

<div class="jumbotron col-6" style="outline: 1px solid #d5d5d5;">
            <div class="row justify-content-center">
              <div class="text-center">
                <h2>Adicionar veículo</h2>
              </div>
              
              <div class="text-center col-6 mb-5">
        
                <form method="post" action="ServletTrabalhoFinal" class="text-start">
                
                
                
		<c:choose>
			<c:when test="${ auto == null }">
				 <div class="form-group">
                    <label for="placa">Placa</label>
                    <input type="text"  class="form-control" name="placa" placeholder="">
                    <span  class="form-text text-muted" style="display: none;">Por favor, entre com a placa.</span>
                  </div>
                  <div class="form-group">
                    <label for="modelo">Modelo</label>
                    <input type="text"  class="form-control"  name="modelo" placeholder="" >
                    <span  class="form-text text-muted" style="display: none;">Por favor, digite o modelo.</span>
                  </div>
                  <div class="form-group">
                    <label for="marca">Marca</label>
                    <input type="text"  class="form-control" name="marca" placeholder="" >
                    <span class="form-text text-muted" style="display: none;">Por favor, entre com a marca.</span>
                  </div>
                  <div class="form-group">
                    <label for="ano">Ano</label>
                    <input type="text" class="form-control" name="ano" placeholder="" >
                    <span class="form-text text-muted" style="display: none;">Por favor, entre com o ano.</span>
                  </div>
                  			
				<button type="submit" class="btn-primary mt-3" name="option" value="salvar">Salvar</button>
			</c:when>
			<c:otherwise>
				<input type="hidden" name="id" value="${auto.id}"/>
											
				<div class="form-group">
                    <label for="placa">Placa</label>
                    <input type="text" value="${auto.placa}" class="form-control" name="placa" placeholder="">
                    <span  class="form-text text-muted" style="display: none;">Por favor, entre com a placa.</span>
                  </div>
                  <div class="form-group">
                    <label for="modelo">Modelo</label>
                    <input type="text" value="${auto.modelo}" class="form-control"  name="modelo" placeholder="" >
                    <span  class="form-text text-muted" style="display: none;">Por favor, digite o modelo.</span>
                  </div>
                  <div class="form-group">
                    <label for="marca">Marca</label>
                    <input type="text" value="${auto.marca}" class="form-control" name="marca" placeholder="" >
                    <span class="form-text text-muted" style="display: none;">Por favor, entre com a marca.</span>
                  </div>
                  <div class="form-group">
                    <label for="ano">Ano</label>
                    <input type="text" value="${auto.ano}" class="form-control" name="ano" placeholder="" >
                    <span class="form-text text-muted" style="display: none;">Por favor, entre com o ano.</span>
                  </div>
                  			
				<button type="submit" class="btn-primary mb-3" name="option" value="atualizar">Atualizar</button>
			</c:otherwise>
		</c:choose>
	</form>
                
                
                
              </div>
            </div>
          </div>
          </div>
 </div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="model.Entrada"%>
 <%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>IJavaBlog</title>
	<!-- <link href="css/comun.css" rel="stylesheet" type="text/css" />  -->
	<!--<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />  -->
	<link href="css/ijavablog.css" rel="stylesheet" type="text/css" />
	
	<script>
	
	const AGREGAR = 0;
		const MODIFICAR = 1;
				
		var confirmar = function() {
			var confirmado = confirm("Seguro que deseas eliminar la entrada?");
			return confirmado; // true o false
		};
		
		var guardar = function(op) {
			var form = document.forms.entradaForm;
			
			if (op == AGREGAR)
				form.action = "agregarEntrada.blog";
			else if (op == MODIFICAR)
				form.action = "modificarEntrada.blog";
			
			form.submit();
		};
	
	
	
	</script>
	
		
</head>
<body  onload="init()">
	

<div id="cabecera" class="cabecera"><%@ include file="cabecera.jsp" %></div>
<div id="navegacion" class="navegacion"><%@ include file="navegacion.jsp" %></div>
	
<div id="errores">
		<c:forEach var="e" items="${errores}">
			${e}<br/>
		</c:forEach>

</div>	
	

		
	<div id="entradas" class="entradas" >
		<table id="tablaEntradas" border="1">
		

		<tbody id="tbodyEntradas" >
		<thead id="cabeceraEntradas" >
		<tr class="cabeceras">
		<td>Id Entrada</td>
		<td>Cabecera</td>
		<td>Entrada</td>
		<td>Usuario autor</td>
		<td>Mostrar</td>
		<td>Eliminar</td></tr>
		
		</thead>
		<%
			// Obteniendo personas que son enviadas desde el Controlador
			List<Entrada> entradas = (List<Entrada>)
			request.getAttribute("entradas");
		
			if (entradas != null) {
				int num = 1;
				for (Entrada ent : entradas) {
		%>
		
					<tr>
						
						<td><%= ent.getIdEntrada() %></td>
						<td><%= ent.getCabeceraEntrada() %></td>
						<td><%= ent.getEntrada() %></td>
						<td><%= ent.getIdusuario() %></td>
						<td><a href="mostrar.blog?idEntrada=<%= ent.getIdEntrada() %>"> Mostrar	</a></td>
						<td><a href="eliminar.blog?idEntrada=<%= ent.getIdEntrada() %>" 
								onclick="return confirmar()" >Eliminar
							</a>
						</td>
					</tr>
										
		<%
				}
			}
		%>
		</tbody>
	</table>
		
	<div style="height: 20px"></div>
	<!--   <h1>Crear entrada</h1> -->
	<form:form action="agregarEntrada.blog" commandName="entradaForm" method="post">
		<table style="width: 98%;" >
		<tr>
				<td>ID:</td>
				<td><form:input path="idEntrada" readonly="true" cssStyle="width:100%"/> </td> 
			</tr>	
			<tr>
				<td>Cabecera:</td>
				<td><form:input path="cabeceraEntrada" cssStyle="width:100%"/> </td> 
			</tr>		
			<tr>
				<td>Entrada:</td>
				<td><form:textarea  path="entrada"  cssStyle="width:100%"/> </td> 
			</tr>		
				
			<tr>
				<td>Fecha de creación:</td>
				<td><form:input path="fechaCreacion" cssStyle="width:100%"/> </td> 
			</tr>		
			<tr>
				<td colspan="2">
					<input type="submit" value="Crear entrada"/>	
					<!-- <input type="button" value="Agregar entrada" onclick="guardar(AGREGAR)"/> -->
				<input type="button" value="Cancelar" onclick="window.location.href='inicio.blog'"/>
				<input type="button" value="Modificar" onclick="guardar(MODIFICAR)"/>			
				</td>
			</tr>		
		</table>	
	</form:form>
	</div> <!--  Cierre de div de entradas -->
	
<div  id="enlaces" class="enlaces"><%@ include file="enlaces.jsp" %></div>
<div  id="pie" class="pie">	<%@ include file="pie.jsp" %></div>
	
</body>
</html>
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
	<link href="css/ijavablog.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="/IJavaBlog/js/util.js"></script>
	
	
</head>
<body>

<div id="cabecera" class="cabecera"><%@ include file="cabecera.jsp" %>
</div>
<div id="navegacion" class="navegacion"><%@ include file="navegacion.jsp" %></div>
<div id="cuerpo" class="entradas"  >
	<div id="errores">
			<c:forEach var="e" items="${errores}">
				${e}<br/>
			</c:forEach>
		</div>
				
	<div id="articulos" >
		<table id="tablaEntradas" border="0">
				<tbody id="tbodyEntradas" >
					<%
					// Obteniendo personas que son enviadas desde el Controlador
					List<Entrada> entradas = (List<Entrada>)
					request.getAttribute("entradas");
				
					if (entradas != null) {
						int num = 1;
						for (Entrada ent : entradas) {
					%>
							<tr class="cabeceras">
								<td><%= ent.getIdEntrada() %></td>
								<td><%= ent.getCabeceraEntrada() %></td>
								<td>Creada por el usuario: <%= ent.getIdusuario() %></td>
							</tr>
							<tr ><td  colspan="3"><hr></td></tr>
							<tr><td class="entradas" colspan="3"><%= ent.getEntrada() %>  </td></tr>
							<tr>
								<td><%= ent.getFechacreacion() %></td>
								<td colspan=2 style="text-align: right;border: thin;" ><a href="comentarios.blog?idEntrada=<%= ent.getIdEntrada() %>" >Comentarios: <%= ent.getnComentarios() %></a>
								 <input type="button" value="Añadir comentario" onclick="mostrar('nuevoComentario_<%= ent.getIdEntrada() %>')"/>	 </td>
							
								
							</tr>
							<tr ><td  colspan="3">
							<div id="nuevoComentario_<%= ent.getIdEntrada() %>" style="display: none;">
								       
								       
								         <form:form action="agregarComentario.blog" commandName="comentarioForm" method="post">
											<table>
											<tr>
										<tr>
													
													<td><input name="idEntrada" value="<%= ent.getIdEntrada() %>"/> </td> 
												</tr>	
												<tr>
													
													<td><form:textarea rows="10" cols="100" path="comentario"/> </td> 
												</tr>		
												
												<tr>
													<td >
														<input type="submit" value="Publicar"/>	
																
													</td>
												</tr>		
											</table>	
										</form:form>
							
							</div>
							</td></tr>
							<tr ><td  colspan="3"><hr></td></tr>
					<%
						}
					}
					%>
			</tbody>
		</table>
	</div>
</div>
<div  id="enlaces" class="enlaces"><%@ include file="enlaces.jsp" %></div>
<div  id="pie" class="pie">	<%@ include file="pie.jsp" %></div>

</body>
</html>
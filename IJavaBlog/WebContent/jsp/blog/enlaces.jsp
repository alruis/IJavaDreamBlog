<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="enlaces">
<div>
<br><br><br><br>
	<font size="5" face="bold"> About me </font>
			<br><br><br><br> 
			Hola chavales ....
</div>
	</br>
	</br>
	
	</br>
	</br>
	<div>
	<form action="autenticar.blog" method="post">
	
		<c:choose>
			<c:when test="${empty sessionScope.usuario}">
				<table>
				<tr><td>Usuario:</td><td><input type="text" name="correo"  /> 	</td></tr>
				<tr><td>Clave:</td><td> <input type="text" name="clave" /> 	</td></tr>
				<tr><td colspan=2><input type="submit" value="Entrar" />	</td></tr>
				</table>
			</c:when>
			<c:otherwise>
			<span style="text-align: right;">
				Bienvenido, ${sessionScope.usuario.correo }
				<a href="cerrarSesion.blog">Cerrar sesión</a>	
			</span>	
			</c:otherwise>
		</c:choose>
	
	</form>
	</div> 	
</div>
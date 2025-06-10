<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.dto.Habitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
List<Habitacion> listaHabitaciones = new ArrayList<>();
if(request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES)!=null){
	listaHabitaciones = (List<Habitacion>) request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES);
}
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Habitaciones</title>
    <link rel="stylesheet" href="styles/style.css" >
    <link rel="stylesheet" href="styles/habitacion.css" >
    <link rel="stylesheet" href="">
</head>
<body>
    
    <%@include file="includes/cabecera.jsp" %>

   	<%@include file="includes/menu.jsp" %>

    <main>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Titulo</th>
					<th>Nº habitación</th>
					<th>Nº cama</th>
					<th>Metros</th>
					<th> Precio</th>
					<th>Exterior</th>
				</tr>
			</thead>
			<tbody>
		
				<%for ( Habitacion elem : listaHabitaciones  ) {%>
				<tr>
					<td><%=elem.getId()%></td>
					<td><%=elem.getTitulo()%></td>
					<td><%=elem.getNum_habitacion()%></td>
					<td><%=elem.getNum_camas()%> </td>
					<td><%=elem.getMetros() %> </td>
					<td> <%=elem.getPrecio() %></td>
					<td> <%=elem.isExterior() ? "Sí" : "No" %></td>
				</tr>
				<%}%>
			</tbody>
		</table>

	</main>

   	<%@include file="includes/pie.jsp" %>

</body>
</html>
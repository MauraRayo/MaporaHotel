<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Contacto</title>
    <link rel="stylesheet" href="styles/style.css" >
    <link rel="stylesheet" href="styles/contacto.css" >
</head>
<body>
    
    <%@include file="includes/cabecera.jsp" %>

   	<%@include file="includes/menu.jsp" %>

    <main>
		<form class="contact-form" action="#" method="post">
		  <h2>Reservar Ahora</h2>
		  <label for="name">Nombre:</label>
		  <input type="text" id="name" name="name" required>
		
		  <label for="email">Correo electrónico:</label>
		  <input type="email" id="email" name="email" required>
		
		  <label for="message">Mensaje:</label>
		  <textarea id="message" name="message" rows="4" required></textarea>
		
		  <button type="submit">Enviar</button>
		</form>
	</main>

   	<%@include file="includes/pie.jsp" %>

</body>
</html>
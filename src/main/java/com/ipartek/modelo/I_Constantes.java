package com.ipartek.modelo;

public interface I_Constantes {

	// CONSTANTES DE LA BD
	String BD = "jsp_mapora_hotel";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//CONSTANTES DE LOS JSP
	String JSP_INDEX = "index.jsp";
	String JSP_HABITACIONES = "habitaciones.jsp";
	String JSP_CONTACTO = "contacto.jsp";
	
	
	//CONSTANTES DE LA TABLA DE HABITACIONES
	
	String TABLA_HABITACION = "habitaciones";
	
	
	//CONSTANTES DEL PROCEDURE
	String SP_TODAS_HABITACIONES ="call sp_todas_habitaciones();";
	
	String HABITACIONES_ID = "id";
	String HABITACIONES_TITULO = "titulo";
	String HABITACIONES_NUM_HABITACION = "num_habitacion"; 
	String HABITACIONES_NUM_CAMAS = "num_camas"; 
	String HABITACIONES_METROS = "metros";
	String HABITACIONES_PRECIO = "precio";
	String HABITACIONES_EXTERIOR = "exterior";
	
	
	
	String ATR_LISTA_HABITACIONES = "atr_lista-habitaciones";
	

}

package com.ipartek.menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.I_Constantes;
import com.ipartek.modelo.dto.Habitacion;



@WebServlet("/MenuHabitaciones")
public class MenuHabitaciones extends HttpServlet implements I_Constantes {
	private static final long serialVersionUID = 1L;
       

    public MenuHabitaciones() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1
				int id = 0;
				if (request.getParameter("p_id") != null) {
					id = Integer.parseInt(request.getParameter("p_id"));
				}
				
				
				String titulo = "";
				if (request.getParameter("p_titulo") != null) {
					titulo = request.getParameter("p_titulo");
				}
				
				int num_habitacion = 0;
				if (request.getParameter("p_num_habitacion") != null) {
					num_habitacion = Integer.parseInt(request.getParameter("p_num_habitacion"));
				}
				
				int num_camas = 0;
				if (request.getParameter("p_num_camas") != null) {
					num_camas = Integer.parseInt(request.getParameter("p_num_camas"));
				}
				
				String metros = "";
				if (request.getParameter("p_metros") != null) {
					metros = request.getParameter("p_metros");
				}
				
				Double precio = 0.0;
				if (request.getParameter("p_precio") != null) {
					precio= Double.parseDouble(request.getParameter("p_precio"));
				}
				
				
				boolean exterior = false;
				if (request.getParameter("p_exterior") != null) {
					exterior=Boolean.parseBoolean(request.getParameter("p_exterior"));
				}
				
				Habitacion habitacion = new Habitacion(0, titulo, num_habitacion, num_camas, metros, num_camas, exterior);
				System.out.println(habitacion);
//				
			
				//paso 3
				DB_Helper db = new DB_Helper();
				Connection con= db.conectar();
			
    			//paso 4
				
				List<Habitacion> listaHabitaciones = db.obtenerTodasHabitaciones(con);
				
				//paso 5 
				db.desconectar(con);
				
				//paso 6
				request.setAttribute(ATR_LISTA_HABITACIONES, listaHabitaciones);

		
				request.getRequestDispatcher(JSP_HABITACIONES).forward(request, response);
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

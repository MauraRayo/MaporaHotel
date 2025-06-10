package com.ipartek.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Habitacion {
	
	private int id;
	private String titulo;
	
	private int num_habitacion;
	private int num_camas;
	
	private String metros;
	private double precio;
	
	private boolean exterior;


}

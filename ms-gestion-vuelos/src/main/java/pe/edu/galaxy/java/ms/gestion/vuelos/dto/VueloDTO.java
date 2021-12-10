package pe.edu.galaxy.java.ms.gestion.vuelos.dto;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@JsonPropertyOrder(value = {"id","codigo","fecha","origen","destino","precio", "capacidad", "estado"})
public class VueloDTO {
	
	private Long id;
	
	private String codigo;
	
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	//@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "GMT+8")
	private Date fecha;
	
	private String origen;
	
	private String destino;

	private double precio;
	
	private String estado;
	
	private int capacidad;
	
	//private AerolineaDTO aerolineaDTO;

}



/********************************************************************************************
 
 
 Fuente:
 	-- Spring boot recibe parámetros de tipo de fecha y hora y método entrante de cartero
 	https://programmerclick.com/article/6994892329/
 
********************************************************************************************/





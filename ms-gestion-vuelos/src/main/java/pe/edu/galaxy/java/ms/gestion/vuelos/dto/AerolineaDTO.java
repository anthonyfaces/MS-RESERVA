package pe.edu.galaxy.java.ms.gestion.vuelos.dto;

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
@JsonPropertyOrder(value = {"id","codigo","capacidad","modelo"})
public class AerolineaDTO {
	
	private Long id;
	
	private String codigo;
	
	private String nombre;

	private int capacidad;

	private String modelo;


}

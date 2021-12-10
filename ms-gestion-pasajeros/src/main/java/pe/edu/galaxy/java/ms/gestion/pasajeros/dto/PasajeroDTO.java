package pe.edu.galaxy.java.ms.gestion.pasajeros.dto;

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
@JsonPropertyOrder(value = {"id","nombre","correo","estado"})
public class PasajeroDTO {
	
	private Long id;

	private String nombre;
	
	private String correo;

	private int estado;

}

package pe.edu.galaxy.java.ms.gestion.pasajeros.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="pasajero")
public class PasajeroEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	@Column(name = "pasajero_id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="estado")
	private int estado;
	

}

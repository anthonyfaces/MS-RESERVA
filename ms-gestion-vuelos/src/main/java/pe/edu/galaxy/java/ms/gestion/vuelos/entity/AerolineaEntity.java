package pe.edu.galaxy.java.ms.gestion.vuelos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name="aerolinea")
public class AerolineaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAerolinea")
	@SequenceGenerator(sequenceName = "SEQ_AEROLINEA", allocationSize = 1, name = "seqAerolinea")
	@Column(name = "aerolinea_id")
	private Long id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="capacidad")
	private int capacidad;

	@Column(name="modelo")
	private String modelo;

}

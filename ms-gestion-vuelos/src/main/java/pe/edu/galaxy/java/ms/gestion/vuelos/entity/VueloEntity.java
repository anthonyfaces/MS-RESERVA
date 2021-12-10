package pe.edu.galaxy.java.ms.gestion.vuelos.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="vuelo")
public class VueloEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqVuelo")
	@SequenceGenerator(sequenceName = "SEQ_VUELO", allocationSize = 1, name = "seqVuelo")
	@Column(name = "vuelo_id")
	private Long id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="origen")
	private String origen;
	
	@Column(name="destino")
	private String destino;

	@Column(name="precio")
	private double precio;
	
	@Column(name="estado")
	private String estado;
	
//	@ManyToOne
//	@JoinColumn(name = "aerolinea_id", nullable = false, foreignKey = @ForeignKey(name= "FK_vuelo_aerolinea"))
//	private AerolineaEntity aerolineaEntity;

	@Column(name="capacidad")
	private int capacidad;

}

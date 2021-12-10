package pe.edu.galaxy.java.ms.gestion.vuelos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.java.ms.gestion.vuelos.entity.VueloEntity;


@Repository
public interface VueloRepository extends JpaRepository<VueloEntity, Long> {
	
	@Query("select v from VueloEntity v where v.estado='1'")
	List<VueloEntity> getAbiertos();

}

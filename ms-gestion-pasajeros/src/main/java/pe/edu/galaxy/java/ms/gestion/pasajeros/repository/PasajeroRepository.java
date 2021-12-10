package pe.edu.galaxy.java.ms.gestion.pasajeros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.java.ms.gestion.pasajeros.entity.PasajeroEntity;


@Repository
public interface PasajeroRepository extends JpaRepository<PasajeroEntity, Long> {
	
	@Query("select p from PasajeroEntity p where p.estado=1")
	List<PasajeroEntity> getActivos();

}

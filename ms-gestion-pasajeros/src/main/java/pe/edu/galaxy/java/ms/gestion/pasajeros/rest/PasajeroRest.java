package pe.edu.galaxy.java.ms.gestion.pasajeros.rest;

import static pe.edu.galaxy.java.ms.gestion.pasajeros.rest.commons.Constants.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.java.ms.gestion.pasajeros.dto.PasajeroDTO;
import pe.edu.galaxy.java.ms.gestion.pasajeros.service.PasajeroService;
import pe.edu.galaxy.java.ms.gestion.pasajeros.service.exception.ServiceException;

@Slf4j
@RestController
@RequestMapping(API_PASAJEROS)
public class PasajeroRest {

	@Autowired
	private PasajeroService pasajeroService;
	
	
	@GetMapping
	public ResponseEntity<List<PasajeroDTO>> findActivos(@RequestParam(name = "nombre", defaultValue = "") String nombre){
		try {
			return ResponseEntity.ok(pasajeroService.findActivos(null));
			
		} catch (ServiceException e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id){
		try {
			return ResponseEntity.ok(pasajeroService.findById(PasajeroDTO.builder().id(id).build()).get());
			
		} catch (ServiceException e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	};



}

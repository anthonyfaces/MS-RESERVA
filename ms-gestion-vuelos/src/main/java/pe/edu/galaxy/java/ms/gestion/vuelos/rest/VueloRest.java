package pe.edu.galaxy.java.ms.gestion.vuelos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.java.ms.gestion.vuelos.dto.VueloDTO;
import pe.edu.galaxy.java.ms.gestion.vuelos.service.VueloService;
import pe.edu.galaxy.java.ms.gestion.vuelos.service.exception.ServiceException;

import static pe.edu.galaxy.java.ms.gestion.vuelos.rest.commons.Constants.*;

@Slf4j
@RestController
@RequestMapping(API_VUELOS)
public class VueloRest {
	
	@Autowired
	private VueloService vueloService;
	
	
	@GetMapping
	public ResponseEntity<List<VueloDTO>> findOpenings(@RequestParam(name = "nombre", defaultValue = "") String nombre){
	
		try {
			return ResponseEntity.ok(vueloService.findOpenings(null));
			
		} catch (ServiceException e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id){
		try {
			return ResponseEntity.ok(vueloService.findById(VueloDTO.builder().id(id).build()).get());
			
		} catch (ServiceException e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	};

}

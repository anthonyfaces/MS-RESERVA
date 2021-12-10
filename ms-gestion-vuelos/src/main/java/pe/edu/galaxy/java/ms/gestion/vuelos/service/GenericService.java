package pe.edu.galaxy.java.ms.gestion.vuelos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.galaxy.java.ms.gestion.vuelos.service.exception.ServiceException;


public interface GenericService<T> {
	
	List<T> findOpenings(T t) throws ServiceException;
	
	Optional<T> findById(T t) throws ServiceException;
	
	T save(T t) throws ServiceException;

}

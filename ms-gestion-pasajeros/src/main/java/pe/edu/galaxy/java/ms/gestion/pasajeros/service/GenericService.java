package pe.edu.galaxy.java.ms.gestion.pasajeros.service;

import java.util.List;
import java.util.Optional;

import pe.edu.galaxy.java.ms.gestion.pasajeros.service.exception.ServiceException;


public interface GenericService<T> {
	
	List<T> findActivos(T t) throws ServiceException;
	
	Optional<T> findById(T t) throws ServiceException;
	
	T save(T t) throws ServiceException;

}

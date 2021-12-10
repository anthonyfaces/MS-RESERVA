package pe.edu.galaxy.java.ms.gestion.pasajeros.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pe.edu.galaxy.java.ms.gestion.pasajeros.dto.PasajeroDTO;
import pe.edu.galaxy.java.ms.gestion.pasajeros.entity.PasajeroEntity;
import pe.edu.galaxy.java.ms.gestion.pasajeros.repository.PasajeroRepository;
import pe.edu.galaxy.java.ms.gestion.pasajeros.service.exception.ServiceException;

@Service
public class PasajeroServiceImpl implements PasajeroService {
	
	@Autowired
	private JsonMapper jsonMapper;
	
	@Autowired
	private PasajeroRepository pasajeroRepository;

	public PasajeroServiceImpl() {

	}

	@Override
	public List<PasajeroDTO> findActivos(PasajeroDTO t) throws ServiceException {
		try {
			return this.pasajeroRepository.getActivos().stream().map(e -> this.getPasajeroDTO(e))
					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public Optional<PasajeroDTO> findById(PasajeroDTO pasajeroDTO) throws ServiceException {
		try {
			Optional<PasajeroEntity> optional = pasajeroRepository.findById(pasajeroDTO.getId());
			
			if(!optional.isEmpty() && optional.isPresent()) {
				PasajeroDTO pDTO = this.getPasajeroDTO(optional.get());
				return Optional.of(pDTO);
			} 
			
			return Optional.empty();
			
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	
		//return Optional.of(null);
	}

	@Override
	public PasajeroDTO save(PasajeroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Mappers
	public PasajeroDTO getPasajeroDTO(PasajeroEntity pasajeroEntity) {
		return jsonMapper.convertValue(pasajeroEntity, PasajeroDTO.class);
	}

	public PasajeroEntity getVueloEntity(PasajeroDTO pasajeroDTO) {
		return jsonMapper.convertValue(pasajeroDTO, PasajeroEntity.class);
	}

}

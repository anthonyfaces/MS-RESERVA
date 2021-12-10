package pe.edu.galaxy.java.ms.gestion.vuelos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pe.edu.galaxy.java.ms.gestion.vuelos.dto.VueloDTO;
import pe.edu.galaxy.java.ms.gestion.vuelos.entity.VueloEntity;
import pe.edu.galaxy.java.ms.gestion.vuelos.repository.VueloRepository;
import pe.edu.galaxy.java.ms.gestion.vuelos.service.exception.ServiceException;

@Service
public class VueloServiceImpl implements VueloService {
	
	@Autowired
	private JsonMapper jsonMapper;
	
	@Autowired
	private VueloRepository vueloRepository;

	public VueloServiceImpl() {

	}

	@Override
	public List<VueloDTO> findOpenings(VueloDTO t) throws ServiceException {
		try {
			return this.vueloRepository.getAbiertos().stream().map(e -> this.getVueloDTO(e))
					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public Optional<VueloDTO> findById(VueloDTO vueloDTO) throws ServiceException {
		try {
			Optional<VueloEntity> optional = vueloRepository.findById(vueloDTO.getId());
			
			if(!optional.isEmpty() && optional.isPresent()) {
				VueloDTO pDTO = this.getVueloDTO(optional.get());
				return Optional.of(pDTO);
			}
			
			return Optional.empty();
			
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	
		//return Optional.of(null);
	}

	@Override
	public VueloDTO save(VueloDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Mappers
	public VueloDTO getVueloDTO(VueloEntity vueloEntity) {
		return jsonMapper.convertValue(vueloEntity, VueloDTO.class);
	}

	public VueloEntity getVueloEntity(VueloDTO vueloDTO) {
		return jsonMapper.convertValue(vueloDTO, VueloEntity.class);
	}

}

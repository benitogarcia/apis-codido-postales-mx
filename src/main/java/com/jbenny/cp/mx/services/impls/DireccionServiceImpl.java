package com.jbenny.cp.mx.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbenny.cp.mx.models.entity.DireccionEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;
import com.jbenny.cp.mx.repositories.IDireccionRepository;
import com.jbenny.cp.mx.services.IDireccionService;

@Service
public class DireccionServiceImpl implements IDireccionService {
	
	@Autowired
	private IDireccionRepository direccionRepository;

	@Override
	public List<DireccionEntity> findByCodigo_postal(Integer cp) {
		return direccionRepository.findByCodigo_postal(cp);
	}

	@Override
	public List<DireccionEntity> findByMunicipio(MunicipioEntity municipio) {
		return direccionRepository.findByMunicipio(municipio);
	}

}

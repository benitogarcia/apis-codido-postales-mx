package com.jbenny.cp.mx.services;

import java.util.List;

import com.jbenny.cp.mx.models.entity.DireccionEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;

public interface IDireccionService {
	
	List<DireccionEntity> findByCodigo_postal(Integer cp);

	List<DireccionEntity> findByMunicipio(MunicipioEntity municipio);

}

package com.jbenny.cp.mx.services;

import java.util.List;

import com.jbenny.cp.mx.models.entity.EstadoEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;

public interface IMunicipioService {
	
	List<MunicipioEntity> findAll();
	
	List<MunicipioEntity> findByEstado(EstadoEntity entity);
	
	MunicipioEntity findById(Long id);

}

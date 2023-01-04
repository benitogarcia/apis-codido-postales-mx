package com.jbenny.cp.mx.services;

import java.util.List;

import com.jbenny.cp.mx.models.entity.EstadoEntity;

public interface IEstadoService {
	
	List<EstadoEntity> findAll();
	
	EstadoEntity findById(Integer id);

}

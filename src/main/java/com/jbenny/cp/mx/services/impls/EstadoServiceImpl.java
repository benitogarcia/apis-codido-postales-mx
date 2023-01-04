package com.jbenny.cp.mx.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbenny.cp.mx.models.entity.EstadoEntity;
import com.jbenny.cp.mx.repositories.IEstadoRepository;
import com.jbenny.cp.mx.services.IEstadoService;

@Service
public class EstadoServiceImpl implements IEstadoService {
	
	@Autowired
	private IEstadoRepository repository;

	@Override
	public List<EstadoEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public EstadoEntity findById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	
}

package com.jbenny.cp.mx.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbenny.cp.mx.models.entity.EstadoEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;
import com.jbenny.cp.mx.repositories.IMunicipioRepository;
import com.jbenny.cp.mx.services.IMunicipioService;

@Service
public class MunicipioServiceImpl implements IMunicipioService {

	@Autowired
	private IMunicipioRepository municipioRepository;

	@Override
	public List<MunicipioEntity> findAll() {
		return municipioRepository.findAll();
	}

	@Override
	public List<MunicipioEntity> findByEstado(EstadoEntity entity) {
		return municipioRepository.findByEstado(entity);
	}

	@Override
	public MunicipioEntity findById(Long id) {
		return municipioRepository.findById(id).orElse(null);
	}

}

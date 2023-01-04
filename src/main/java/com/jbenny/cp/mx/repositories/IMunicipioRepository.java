package com.jbenny.cp.mx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jbenny.cp.mx.models.entity.EstadoEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;

@Repository
public interface IMunicipioRepository extends JpaRepository<MunicipioEntity, Long> {
	
	List<MunicipioEntity> findByEstado(EstadoEntity entity);

}

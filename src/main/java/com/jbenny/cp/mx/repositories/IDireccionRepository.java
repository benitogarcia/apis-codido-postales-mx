package com.jbenny.cp.mx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jbenny.cp.mx.models.entity.DireccionEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;

@Repository
public interface IDireccionRepository extends JpaRepository<DireccionEntity, Long> {

	@Query(value= "SELECT d FROM DireccionEntity d WHERE d.codigopostal  = ?1")
	List<DireccionEntity> findByCodigo_postal(Integer codigopostal);
	//List<DireccionEntity> findByCodigopostal(Integer cp);

	List<DireccionEntity> findByMunicipio(MunicipioEntity municipio);

}

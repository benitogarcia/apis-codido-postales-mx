package com.jbenny.cp.mx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jbenny.cp.mx.models.entity.EstadoEntity;

@Repository
public interface IEstadoRepository extends JpaRepository<EstadoEntity, Integer> {

}

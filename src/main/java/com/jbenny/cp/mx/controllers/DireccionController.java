package com.jbenny.cp.mx.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jbenny.cp.mx.models.entity.DireccionEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;
import com.jbenny.cp.mx.services.IDireccionService;
import com.jbenny.cp.mx.services.IMunicipioService;

@RestController
@RequestMapping("v1/direcciones")
@CrossOrigin(origins = {"http://localhost:4200/"}, methods = {RequestMethod.GET})
public class DireccionController {
		
	private static final Logger LOG = LoggerFactory.getLogger(DireccionController.class);
	
	@Autowired
	private IDireccionService direccionService;
	@Autowired
	private IMunicipioService municipioService;

	@GetMapping("/cp/{cp}")
	public ResponseEntity<?> findByCP(@PathVariable(name = "cp", required = true) Integer cp) {
		
		LOG.info("findByCP: Busqueda por codigo postal.");

		List<DireccionEntity> entities = direccionService.findByCodigo_postal(cp);
		
		LOG.info("findByCP: Resultados ", entities.size());
		
		if (entities.size() == 0) {
			return new ResponseEntity<List<DireccionEntity>>(entities, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DireccionEntity>>(entities, HttpStatus.OK);

	}

	@GetMapping("/mpio/{mpio}")
	public ResponseEntity<?> findByMpio(@PathVariable(name = "mpio", required = true) Long mpio) {
		
		MunicipioEntity entity = municipioService.findById(mpio);
		
		if (entity == null) {
			return new ResponseEntity<String>("", HttpStatus.BAD_REQUEST);
		}

		List<DireccionEntity> entities = direccionService.findByMunicipio(entity);
		
		if (entities.size() == 0) {
			return new ResponseEntity<List<DireccionEntity>>(entities, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DireccionEntity>>(entities, HttpStatus.OK);

	}
}

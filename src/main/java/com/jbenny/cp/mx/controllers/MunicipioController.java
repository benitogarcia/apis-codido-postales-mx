package com.jbenny.cp.mx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jbenny.cp.mx.models.entity.EstadoEntity;
import com.jbenny.cp.mx.models.entity.MunicipioEntity;
import com.jbenny.cp.mx.services.IEstadoService;
import com.jbenny.cp.mx.services.IMunicipioService;

@RestController
@RequestMapping("v1/municipios")
//@CrossOrigin(origins = {"http://localhost:4200/"}, methods = {RequestMethod.GET})
public class MunicipioController {
	
	@Autowired
	private IMunicipioService municipioService;
	@Autowired
	private IEstadoService estadoService;
	

	@GetMapping("")
	public ResponseEntity<?> findAll() {
		
		List<MunicipioEntity> entities = municipioService.findAll();	
		if (entities.size()==0) {
			return new ResponseEntity<List<MunicipioEntity>>(entities, HttpStatus.NO_CONTENT);			
		}		
		return new ResponseEntity<List<MunicipioEntity>>(entities, HttpStatus.OK);
	}
	
	@GetMapping("/estado/{id}")
	public ResponseEntity<?> findByEstado(@PathVariable(name = "id", required = true) Integer id) {
		
		EstadoEntity entity = estadoService.findById(id);
		
		if (entity==null) {
			return new ResponseEntity<String>("Error en la solicitud.", HttpStatus.BAD_REQUEST);
		}
		
		List<MunicipioEntity> entities = municipioService.findByEstado(entity);
		
		if (entities.size()==0) {
			return new ResponseEntity<List<MunicipioEntity>>(entities, HttpStatus.NO_CONTENT);			
		}		
		return new ResponseEntity<List<MunicipioEntity>>(entities, HttpStatus.OK);
		
	}

}

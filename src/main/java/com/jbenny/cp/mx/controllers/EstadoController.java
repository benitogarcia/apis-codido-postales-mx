package com.jbenny.cp.mx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jbenny.cp.mx.models.entity.EstadoEntity;
import com.jbenny.cp.mx.services.impls.EstadoServiceImpl;

@RestController
@RequestMapping("v1/estados")
//@CrossOrigin(origins = {"http://localhost:4200/"}, methods = {RequestMethod.GET})
public class EstadoController {
	
	@Autowired
	private EstadoServiceImpl estadoServiceImpl;
	
	@GetMapping("")
	public ResponseEntity<?> findAll() {
		
		List<EstadoEntity> entities = estadoServiceImpl.findAll();	
		if (entities.size()==0) {
			return new ResponseEntity<List<EstadoEntity>>(entities, HttpStatus.NO_CONTENT);			
		}		
		return new ResponseEntity<List<EstadoEntity>>(entities, HttpStatus.OK);
	}
	
	

}

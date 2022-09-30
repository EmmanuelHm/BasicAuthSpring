package com.bolsadeideas.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.entity.Profesor;
import com.bolsadeideas.springboot.app.service.IProfesorService;

@RestController
public class ProfesorController {
	
	@Autowired
	private IProfesorService profesorService;
	
	@GetMapping("/todos_profesores_public")
	public ResponseEntity<List<Profesor>> listAllProfessors(){
		
		List<Profesor> profesores = profesorService.findAllProfessor();
		
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);			
		}
		
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);	
	}
	
	@GetMapping("/todos_profesores_admin")
	public ResponseEntity<List<Profesor>> listAllProfessorsAdmin(){
		
		List<Profesor> profesores = profesorService.findAllProfessor();
		
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);			
		}
		
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);	
	}
	
	@GetMapping("/todos_profesores_user")
	public ResponseEntity<List<Profesor>> listAllProfessorsUser(){
		
		List<Profesor> profesores = profesorService.findAllProfessor();
		
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);			
		}
		
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);	
	}

}

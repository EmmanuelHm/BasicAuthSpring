package com.bolsadeideas.springboot.app.service;

import java.util.List;

import com.bolsadeideas.springboot.app.entity.Profesor;

public interface IProfesorService {

	public List<Profesor> findAllProfessor();
}

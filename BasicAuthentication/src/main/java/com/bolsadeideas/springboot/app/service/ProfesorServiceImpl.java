package com.bolsadeideas.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.dao.IProfesorDao;
import com.bolsadeideas.springboot.app.entity.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService {

	@Autowired
	private IProfesorDao profesorDao;
	
	@Override
	public List<Profesor> findAllProfessor() {
		return (List<Profesor>) profesorDao.findAll();
	}

}

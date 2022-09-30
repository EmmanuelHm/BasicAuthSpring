package com.bolsadeideas.springboot.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.entity.Profesor;

public interface IProfesorDao extends CrudRepository<Profesor, Long>{

}

package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Estudiante;

public interface EstudianteDAO {

public List<Estudiante> findAll();
	
	public Estudiante findOne(int id);
	
	public void add(Estudiante autor);
	
	public void up(Estudiante estudiante);

	public void del(int id);
	
}

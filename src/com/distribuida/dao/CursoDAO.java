package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Curso;

public interface CursoDAO {

public List<Curso> findAll();
	
	public Curso findOne(int id);
	
	public void add(Curso curso);
	
	public void up(Curso curso);

	public void del(int id);
}

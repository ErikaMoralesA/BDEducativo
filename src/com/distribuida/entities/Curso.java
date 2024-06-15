package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "curso")

public class Curso {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_curso")
	private int id_curso;
	@Column(name="nombreCurso")
	private String nombreCurso;
	@Column(name="numCurso")
	private String numCurso;
	@Column(name="horas")
	private String horas;
	@Column(name="departamentos")
	private String departamentos;
	
	public Curso () {}

	public Curso(int id_curso, String nombreCurso, String numCurso, String horas, String departamentos) {
		this.id_curso = id_curso;
		this.nombreCurso = nombreCurso;
		this.numCurso = numCurso;
		this.horas = horas;
		this.departamentos = departamentos;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setIdCurso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNumCurso() {
		return numCurso;
	}

	public void setNumCurso(String numCurso) {
		this.numCurso = numCurso;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(String departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Curso [id_curso=" + id_curso + ", nombreCurso=" + nombreCurso + ", numCurso=" + numCurso + ", horas="
				+ horas + ", departamentos=" + departamentos + "]";
	}

	
	
	
}

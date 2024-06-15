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
	private int idCurso;
	@Column(name="nombreCurso")
	private String nombreCurso;
	@Column(name="numCurso")
	private String numCurso;
	@Column(name="horas")
	private String horas;
	@Column(name="departamento")
	private String departamento;
	
	public Curso () {}

	public Curso(int idCurso, String nombreCurso, String numCurso, String horas, String departamento) {
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.numCurso = numCurso;
		this.horas = horas;
		this.departamento = departamento;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", numCurso=" + numCurso + ", horas="
				+ horas + ", departamento=" + departamento + "]";
	}

	
	
	
}

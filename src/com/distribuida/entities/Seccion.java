package com.distribuida.entities;

public class Seccion {

	private int idSeccion;
	private String idseccion;
	private String semestre;
	private String año;
	private String profesor;
	private Curso curso;
	
	public Seccion () {}

	public Seccion(int idSeccion, String idseccion2, String semestre, String año, String profesor, Curso curso) {
		this.idSeccion = idSeccion;
		this.idseccion = idseccion2;
		this.semestre = semestre;
		this.año = año;
		this.profesor = profesor;
		this.curso = curso;
	}

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

	public String getIdseccion() {
		return idseccion;
	}

	public void setIdseccion(String idseccion) {
		this.idseccion = idseccion;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Seccion [idSeccion=" + idSeccion + ", idseccion=" + idseccion + ", semestre=" + semestre + ", año="
				+ año + ", profesor=" + profesor + ", curso=" + curso + "]";
	}
	
	
	
}

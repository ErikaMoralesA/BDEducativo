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
@Table(name = "estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_estudiante")
	private int idEstudiante;
	@Column(name="nombre")
	private String nombre;
	@Column(name="numEstudiante")
	private String numEstudinate;
	@Column(name="clase")
	private String clase;
	@Column(name="especialidad")
	private String especialidad;
	
	public Estudiante () {}

	public Estudiante(int idEstudiante, String nombre, String numEstudinate, String clase, String especialidad) {
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.numEstudinate = numEstudinate;
		this.clase = clase;
		this.especialidad = especialidad;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumEstudinate() {
		return numEstudinate;
	}

	public void setNumEstudinate(String numEstudinate) {
		this.numEstudinate = numEstudinate;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", numEstudinate=" + numEstudinate
				+ ", clase=" + clase + ", especialidad=" + especialidad + "]";
	}
	
	
	
}

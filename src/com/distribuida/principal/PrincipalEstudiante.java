package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EstudianteDAO;
import com.distribuida.entities.Estudiante;

public class PrincipalEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patron de IoC o Inversión de Conrtol
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		EstudianteDAO estudianteDAO = context.getBean("estudianteDAOImpl",EstudianteDAO.class);
		
		List<Estudiante> estudiante = estudianteDAO.findAll();
		
		estudiante.forEach(item -> {
			
			System.out.println(item.toString());
		});
				
		context.close();
		
	}
	
}

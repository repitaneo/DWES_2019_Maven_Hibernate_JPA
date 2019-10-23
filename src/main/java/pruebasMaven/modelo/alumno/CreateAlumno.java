package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.Connection;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {
		
		
		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();
	}

}

package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.Connection;

public class DeleteAlumno {

	public void delete(AlumnoBean alumno) {
		
		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();
		AlumnoBean alumnoBorrar = entityManager.find(AlumnoBean.class, alumno.getIdAlumno());
		if(alumnoBorrar!=null) {
			
			entityManager.remove(alumnoBorrar);
		}
		entityManager.getTransaction().commit();
		

	}	
}

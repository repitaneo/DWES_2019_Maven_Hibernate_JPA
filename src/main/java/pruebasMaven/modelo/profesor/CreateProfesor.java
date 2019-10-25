package pruebasMaven.modelo.profesor;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;



public class CreateProfesor {

	public void create(ProfesorBean profesor) {
		
		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(profesor);
		entityManager.getTransaction().commit();
	}

}

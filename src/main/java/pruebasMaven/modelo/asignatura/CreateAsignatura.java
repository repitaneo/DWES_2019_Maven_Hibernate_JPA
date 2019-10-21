package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AsignaturaBean;



public class CreateAsignatura {

	public void create(AsignaturaBean asignatura) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.marcos.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(asignatura);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}

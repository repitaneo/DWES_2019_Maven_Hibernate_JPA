package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.util.ConnectionEntityManager;
import pruebasMaven.util.ConnectionEntityManagerFactory;

public class ReadAsignatura {

	/**
	 * Busca una asignatura
	 * @param id el ID de la asignatura
	 * @return la asignaturaBean
	 */
	public static AsignaturaBean getAsignatura(long id) {
		
		// conecta, busca por id y devuelve la asignatura
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		AsignaturaBean buscada = entityManager.find(AsignaturaBean.class, id);
		
		entityManager.close();
		
		return buscada;
	}
	

}

package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.util.Connection;

public class ReadAsignatura {

	
	public static AsignaturaBean getAsignatura(long id) {
		
		EntityManager entityManager = Connection.getEntityManager();
		AsignaturaBean buscada = entityManager.find(AsignaturaBean.class, id);
		
		return buscada;
	}
	

}

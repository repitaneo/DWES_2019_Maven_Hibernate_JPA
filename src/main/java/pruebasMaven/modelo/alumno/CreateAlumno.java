package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.ConnectionEntityManager;
import pruebasMaven.util.ConnectionEntityManagerFactory;


/**
 * Clase que inserta alumnos en la base de datos
 * @author marcos
 *
 */
public class CreateAlumno {

	
	/**
	 * Crea un alumno persistíendolo en la base de datos
	 * @param alumno
	 */
	public void create(AlumnoBean alumno) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}

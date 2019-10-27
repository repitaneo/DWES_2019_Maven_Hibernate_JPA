package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.ConnectionEntityManager;
import pruebasMaven.util.ConnectionEntityManagerFactory;


/**
 * Clase que borra alummos en la base de datos
 * @author marcos
 *
 */
public class DeleteAlumno {

	
	/**
	 * Borra un alumno
	 * @param alumno Bean del alumno a borrar
	 */
	public void delete(AlumnoBean alumno) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacci�n
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		AlumnoBean alumnoBorrar = entityManager.find(AlumnoBean.class, alumno.getIdAlumno());
		if(alumnoBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(alumnoBorrar);
		}
		// Cierra la transacci�n y la conexi�n ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	
}

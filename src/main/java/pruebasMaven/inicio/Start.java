package pruebasMaven.inicio;

import pruebasMaven.modelo.CreateAlumno;
import pruebasMaven.negocio.AlumnoBean;

public class Start {

	public static void main(String[] args) {
		
		AlumnoBean alumno = new AlumnoBean();
		alumno.setNombre("Marcos");
		alumno.setTelefono("666555444333");
		
		CreateAlumno create = new CreateAlumno();
		create.create(alumno);
	}

}

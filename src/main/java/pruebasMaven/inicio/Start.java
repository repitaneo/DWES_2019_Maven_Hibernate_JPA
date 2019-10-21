package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;

public class Start {

	public static void main(String[] args) {
		
		/*
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("lengua");
		
		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("mates");
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		*/
		
		
		AlumnoBean marcos = new AlumnoBean();
		marcos.setId(4L);
		
		DeleteAlumno delete = new DeleteAlumno();
		delete.delete(marcos);
		

		
		
	}

}

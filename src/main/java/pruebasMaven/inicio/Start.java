package pruebasMaven.inicio;

import java.util.List;

import javax.persistence.EntityManager;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.asignatura.ReadAsignatura;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.util.Connection;

public class Start {

	public static void main(String[] args) {
		

		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("lengua");
		
		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("historia");
		
		AsignaturaBean filosofia = new AsignaturaBean();
		filosofia.setNombre("filosofia");

		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("mates");
		

		
		
		
		AlumnoBean maria = new AlumnoBean();
		maria.setNombre("Maria");
		maria.setCiudad("Oviedo");
		maria.setTelefono("666555444");
		
		AlumnoBean marcos = new AlumnoBean();
		marcos.setNombre("Marcos");
		marcos.setCiudad("Oviedo");
		marcos.setTelefono("666555444");

		
		filosofia.addAlumno(marcos);
		filosofia.addAlumno(maria);
		
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		createAsignatura.create(historia);
		createAsignatura.create(filosofia);
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(marcos);
		createAlumno.create(maria);

		
		AsignaturaBean nueva = Connection.getEntityManager().find(AsignaturaBean.class, 4L);
		System.out.println(nueva);
		
		Connection.getEntityManager().close();
		
		
	}

}

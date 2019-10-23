package pruebasMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asignatura")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AsignaturaBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idAsignatura;

	@Column
	private String nombre;

	
	@OneToMany(mappedBy = "asignatura")
	private List<AlumnoBean> alumnos = new ArrayList<AlumnoBean>();
	

	
	public void addAlumno(AlumnoBean alumno) {
		
		if(!alumnos.contains(alumno)) {
			
			alumnos.add(alumno);
			alumno.setAsignatura(this);
		}
	}
	


	public List<AlumnoBean> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoBean> alumnos) {
		this.alumnos = alumnos;
	}
	public long getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(long idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "AsignaturaBean [idAsignatura=" + idAsignatura + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}

	
	

	
}

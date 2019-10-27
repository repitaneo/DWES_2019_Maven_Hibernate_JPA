package pruebasMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Bean de tipo DAO para el la asignatura
 * @author marcos
 *
 */
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

	
	// Una asignatura para muchos alumnos
	@ManyToMany(mappedBy = "asignaturas", cascade = CascadeType.ALL)
	private List<AlumnoBean> alumnos = new ArrayList<AlumnoBean>();
	

	// Una asignatura solo la imparte un profesor
	@ManyToOne
	private ProfesorBean profesor;
	
	
	/**
	 * Operación que permite añadir alumnos a la asignatuta y esta asignatura a la lista de alumnos
	 * @param alumno
	 */
	public void addAlumno(AlumnoBean alumno) {
		
		if(!alumnos.contains(alumno)) {
			
			alumnos.add(alumno);
			
			// decirle al alumno que añada esta asignatura
			List<AsignaturaBean> asignaturas = alumno.getAsignaturas();
			if(!asignaturas.contains(this)) {
				
				asignaturas.add(this);
			}
		}
	}
	


	public ProfesorBean getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorBean profesor) {
		this.profesor = profesor;
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

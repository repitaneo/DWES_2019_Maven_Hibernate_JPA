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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="profesorado")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ProfesorBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idProfesor;

	@Column(name="nombre")
	private String nombre;




	@OneToMany(mappedBy="profesor", cascade = CascadeType.ALL)
	private List<AsignaturaBean> asignaturas = new ArrayList<AsignaturaBean>();
	
	
	
	public void addAsignatura(AsignaturaBean asignatura) {
		
		if(!asignaturas.contains(asignatura)) {
			
			asignaturas.add(asignatura);
			asignatura.setProfesor(this);
		}
	}
	
	
	public long getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(long idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<AsignaturaBean> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<AsignaturaBean> asignaturas) {
		this.asignaturas = asignaturas;
	}

	
	
	
	

	
	
	
	
	
	
	
}

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
import javax.persistence.Table;


/**
 * Bean de tipo DAO para el Alumno
 * @author marcos
 *
 */
@Entity
@Table(name="alumno")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AlumnoBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column
	private long idAlumno;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column
	private String ciudad;
	
	// Un alumno cursa muchas asignaturas
	@ManyToMany(cascade = CascadeType.ALL)
	private List<AsignaturaBean> asignaturas = new ArrayList<AsignaturaBean>();
	
	
	
	
	
	
	
	

	public List<AsignaturaBean> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<AsignaturaBean> asignaturas) {
		this.asignaturas = asignaturas;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "AlumnoBean [idAlumno=" + idAlumno + ", nombre=" + nombre + ", telefono=" + telefono + ", ciudad="
				+ ciudad  + "]";
	}

	
	
	
	
	
	
	
}

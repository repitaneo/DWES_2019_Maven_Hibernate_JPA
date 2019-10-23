package pruebasMaven.negocio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	
	@ManyToOne
	@JoinColumn(name="FK_asignatura")
	private AsignaturaBean asignatura;
	
	
	
	
	
	
	
	
	public AsignaturaBean getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(AsignaturaBean asignatura) {
		this.asignatura = asignatura;
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
				+ ciudad + ", asignatura=" + asignatura + "]";
	}

	
	
	
	
	
	
	
}

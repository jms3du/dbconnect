package dbconnect.main.java.model;

public class Alumno {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	
	
	public Alumno(int id, String nombre, String apellidos, String dni, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", name=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", email=" + email
				+ "]";
	}
	
	
	

}

package SecMec;

public class Medico extends PersonalSanitario{
	private String especialidad;
	
	public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, String especialidad) {
		super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Especialidad: " + especialidad;
	}
}

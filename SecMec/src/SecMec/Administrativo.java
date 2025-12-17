package SecMec;

public class Administrativo extends Usuario{
	private String idAdministrativo;
	
	public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
		super(nombre, dni, email, direccion, username, passwordHash, salt);
		this.idAdministrativo = idAdministrativo;
	}
	
	public void asignarMedico(Paciente paciente, Medico medico) {
		paciente.setMedicoAsignado(medico);
	}
	
	public void asignarPrueba(Paciente paciente, PruebaMedica prueba) {
		paciente.getHistorial().agregarEntrada(prueba);
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Administrativo ID: " + idAdministrativo;
	}
}

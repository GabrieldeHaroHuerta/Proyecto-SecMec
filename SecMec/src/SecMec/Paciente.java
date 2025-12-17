package SecMec;

public class Paciente extends Persona{
	private HistorialMedico historial;
    private Medico medicoAsignado;
    
    public Paciente(String nombre, String dni, String email, String direccion) {
    	super(nombre, dni, email, direccion);
    	this.historial = new HistorialMedico();
    }
    
    public HistorialMedico getHistorial() {
    	return historial;
    }
    
    public Medico getMedicoAsignado() {
    	return medicoAsignado;
    }
    
    public void setMedicoAsignado (Medico medicoAsignado) {
    	this.medicoAsignado = medicoAsignado;
    }
    
    @Override
    public String toString() {
		return super.toString();
	}
}

package SecMec;

public class Paciente {
	HistorialMedico historial;
    Medico medicoAsignado;
    public Paciente() {
    	
    }
    
    public HistorialMedico getHistorial() {
    	return historial;
    }
    
    public void setHistorial (HistorialMedico historial) {
    	this.historial = historial;
    }
    
    public Medico getMedicoAsignado() {
    	return medicoAsignado;
    }
    
    public void setMedicoAsignado (Medico medicoAsignado) {
    	this.medicoAsignado = medicoAsignado;
    }
    
    public String toString() {
		return "Paciente{" +
                ", Historial:'" + historial +
                ", MedicoAsignado:" + medicoAsignado +
                '}';
	}
}

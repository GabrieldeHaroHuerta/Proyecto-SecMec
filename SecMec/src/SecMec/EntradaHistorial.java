package SecMec;

import java.time.LocalDate;

public abstract class EntradaHistorial {
	LocalDate fecha;
    String idMedico;
    String causa;
    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
    	this.fecha = fecha;
    	this.idMedico = idMedico;
    	this.causa = causa;
    }
    public LocalDate getFecha() {
    	return fecha;
    }
    public String getIdMedico() {
    	return idMedico;
    }
    public String getCausa() {
    	return causa;
    }
    public String getTipo(String tipo) {
    	return tipo;
    }
}

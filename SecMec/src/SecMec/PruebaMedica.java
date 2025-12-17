package SecMec;
import java.time.LocalDate;

public class PruebaMedica extends EntradaHistorial{
	private String tipoPrueba;
	private String resultado;
	
	public PruebaMedica(LocalDate fecha, String idMedico, String causa, String tipoPrueba, String resultado) {
		super(fecha, idMedico, causa);
		this.tipoPrueba = tipoPrueba;
		this.resultado = resultado;
	}
	
	public String getTipoPrueba() {
		return tipoPrueba;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	@Override
	public String getTipo() {
		return "Prueba Medica";
	}
	
	@Override
    public String toString() {
        return getTipo() + " | Tipo: " + tipoPrueba + " | Resultado: " + resultado;
    }
}

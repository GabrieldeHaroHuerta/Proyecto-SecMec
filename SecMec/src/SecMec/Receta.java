package SecMec;
import java.util.List;
import java.time.LocalDate;

public class Receta extends EntradaHistorial{
	private List<String> medicamentos;
	
	public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
		super(fecha, idMedico, causa);
		this.medicamentos = medicamentos;
	}
	
	public List<String> getMedicamentos(){
		return medicamentos;
	}
	
	@Override
	public String getTipo() {
		return "Receta";
	}
	
	@Override
	public String toString() {
		return getTipo() + " | Medicamentos" + medicamentos;
	}
}

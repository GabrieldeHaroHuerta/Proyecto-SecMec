package SecMec;
import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
	private List<EntradaHistorial> entradas;
	
	public HistorialMedico() {
		entradas = new ArrayList<>();
	}
	
	public List<EntradaHistorial> getEntradas(){
		return entradas;
	}
	
	public void agregarEntrada(EntradaHistorial entrada) {
		entradas.add(entrada);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Historial Médico:\n");
        for (EntradaHistorial e : entradas) {
            sb.append(e).append("\n");
        }
        return sb.toString();
	}
}

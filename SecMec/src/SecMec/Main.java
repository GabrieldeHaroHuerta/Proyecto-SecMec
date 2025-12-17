package SecMec;
import java.util.List;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Medico medico = new Medico(
                "Dr. García", "12345678A", "garcia@mail.com", "Calle Salud 1",
                "dgarcia", "hash", "salt",
                "COL123", "Medicina General"
        );

        Paciente paciente = new Paciente(
                "Juan Pérez", "87654321B", "juan@mail.com", "Calle Luna 5"
        );

        Administrativo admin = new Administrativo(
                "Ana López", "11223344C", "ana@mail.com", "Calle Admin 3",
                "admin", "hash", "salt", "ADM01"
        );

        admin.asignarMedico(paciente, medico);

        PruebaMedica prueba = new PruebaMedica(
                LocalDate.now(),
                medico.getNumeroColegionado(),
                "Dolor abdominal",
                "Análisis de sangre",
                "Valores normales"
        );

        admin.asignarPrueba(paciente, prueba);

        Receta receta = new Receta(
                LocalDate.now(),
                medico.getNumeroColegionado(),
                "Tratamiento",
                List.of("Ibuprofeno", "Paracetamol")
        );

        paciente.getHistorial().agregarEntrada(receta);

        System.out.println(paciente);
        System.out.println(paciente.getHistorial());
	}
}
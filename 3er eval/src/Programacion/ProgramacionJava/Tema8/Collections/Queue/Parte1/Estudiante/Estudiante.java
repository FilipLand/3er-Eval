package ProgramacionJava.Tema8.Collections.Queue.Parte1.Estudiante;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estudiante {
    private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate fecha;

    private String nombre;
    private String apellido;
    private Integer notMed;

    public Estudiante(String nombre, String apellido, String fecha, Integer notMed) {

        this.fecha = LocalDate.parse(fecha, formatoFecha);
        this.nombre = nombre;
        this.apellido = apellido;
        this.notMed = notMed;
    }

    @Override
    public String toString() {
        return "nombre;apellidos;fecha de nacimiento,nota media\n"
                + nombre + ";" + apellido + ";" + fecha + ";" + notMed;
    }

}

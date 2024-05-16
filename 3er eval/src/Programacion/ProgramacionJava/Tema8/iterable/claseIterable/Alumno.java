package ProgramacionJava.Tema8.iterable.claseIterable;

public class Alumno {

    public String nombre;
    public String nia;
    public String curso;
    public Double notaMedia;

    public Alumno(String nombre, String nia, String curso, double notaMedia) {
        this.nombre = nombre;
        this.nia = nia;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno:[nombre=" + nombre + ", nia=" + nia + ", curso=" + curso + ", notaMedia=" + notaMedia + "]";
    }
}
package ProgramacionJava.trabajoFinal;

public class Jugador {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer nivel;

    public Jugador(String nombre, String apellido, Integer edad, Integer nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String cambiarACsv() {
        return nombre + ";" + apellido + ";" + edad + ";" + nivel;
    }
}

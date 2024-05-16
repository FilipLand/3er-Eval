package ProgramacionJava.Bingo.Ejercicio;

public class Jugador {
    public String nombre;
    public String cuidad;
    public String edad;

    public Jugador(String nombre, String cuidad, String edad) {
        this.nombre = nombre;
        this.cuidad = cuidad;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", cuidad=" + cuidad + ", edad=" + edad + "]";
    }
}

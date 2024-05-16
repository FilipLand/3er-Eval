package ProgramacionJava.Tema8.Enumeracion.Trabajos.Ejercicio1;

public enum NivelJuego {
    PRINCIPIANTE(false),
    INTERMEDIO(false),
    AVANZADO(true);

    public final Boolean dificultad;

    NivelJuego(Boolean dificultad) {
        this.dificultad = dificultad;
    }

    public Boolean getDificultad() {
        return dificultad;
    }
}

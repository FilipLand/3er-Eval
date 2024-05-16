package ProgramacionJava.Tema8.Enumeracion.Tests.ejemplo1;

public class EjemploEnum {
    public static void main(String[] args) {
        // Uso del Enum
        DiaSemana hoy = DiaSemana.MARTES;

        // Switch con Enum
        switch (hoy) {
            case LUNES:
                System.out.println("Es lunes, ánimo!");
                break;
            case MARTES:
                System.out.println("Es martes, aún queda mucho por delante.");
                break;
            default:
                System.out.println("Es otro día de la semana.");
        }
    }

    public enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}

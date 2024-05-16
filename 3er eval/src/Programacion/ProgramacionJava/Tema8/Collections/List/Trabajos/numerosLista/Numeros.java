package ProgramacionJava.Tema8.Collections.List.Trabajos.numerosLista;

public class Numeros {
    int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "[ numero = " + numero + " ]\n";
    }

}

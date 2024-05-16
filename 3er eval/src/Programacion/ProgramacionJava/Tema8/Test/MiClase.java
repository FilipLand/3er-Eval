package ProgramacionJava.Tema8.Test;

public class MiClase {
    private int numero;
    private String texto;

    public MiClase(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "MiClase [texto=" + texto + ", numero=" + numero + "]\n";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

package enumera;

public enum Moneda {
    // Constantes
    EURO("€"),
    DOLAR("$"),
    LIBRA("£"),
    YEN("¥");

    // Atributos adicionales
    private String simbolos;

    // Constructor
    private Moneda(String simbolo) {
        this.simbolos = simbolo;
    }

    // Getter del atributo adicional
    public String getSimbolo() {
        return simbolos;
    }
}

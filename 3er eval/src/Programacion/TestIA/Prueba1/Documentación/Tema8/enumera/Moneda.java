package enumera;

public enum Moneda {
    // Constantes
    EURO("€"),
    DOLAR("$"),
    LIBRA("£"),
    YEN("¥");

    // Atributos adicionales
    private String simbolo;

    // Constructor
    private Moneda(String simbolo) {
        this.simbolo = simbolo;
    }

    // Getter del atributo adicional
    public String getSimbolo() {
        return simbolo;
    }
}

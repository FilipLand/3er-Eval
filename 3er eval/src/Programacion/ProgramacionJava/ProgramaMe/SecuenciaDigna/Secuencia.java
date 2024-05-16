package ProgramacionJava.ProgramaMe.SecuenciaDigna;

public class Secuencia {
    static java.util.Scanner in;

    public static void casoDePrueba() {
        int cantNum = in.nextInt();
        int[] cadena = new int[cantNum];

        for (int i = 0; i < cadena.length; i++) {
            String numCad = in.nextLine();
            String[] partes = numCad.split(" ");

            for (int j = 0; j < partes.length; j++) {
                int valor1 = Integer.parseInt(partes[j + 1]);
                int valor2 = Integer.parseInt(partes[j]);

                if (Math.abs(valor2) > (Math.abs(valor1))) {
                    /*
                     * if(){
                     * 
                     * };
                     */
                } /*
                   * else if () {
                   * 
                   * }
                   */
            }
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}

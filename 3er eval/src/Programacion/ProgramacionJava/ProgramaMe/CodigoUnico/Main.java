package ProgramacionJava.ProgramaMe.CodigoUnico;

public class Main {
    static java.util.Scanner in;

    public static void casoDePrueba(int numCasos, String[] player) {
        for (int i = 0; i < numCasos; i++) {
            player[i] = in.nextLine();
        }
        String[] partes = player;

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        String[] player = new String[numCasos];
        for (int i = 0; i < numCasos; i++)
            casoDePrueba(numCasos, player);
    }
}

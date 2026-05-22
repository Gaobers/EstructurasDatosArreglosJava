   import java.util.Scanner;

    public class Ejercicio1NombresFrutas {
        public static void main(String[] args) {

            String[] frutas = new String[10];
            Scanner teclado = new Scanner(System.in);

            System.out.println("--- Registro de Frutas ---");

            for (int i = 0; i < frutas.length; i++) {
                System.out.print("Ingresa la fruta número " + (i + 1) + ": ");
                frutas[i] = teclado.nextLine();
            }

            System.out.println("\n--- Mostrando las frutas en orden inverso ---");

            for (int i = frutas.length - 1; i >= 0; i--) {
                System.out.println("Posición [" + i + "]: " + frutas[i]);
            }

            teclado.close();
        }
    }
import java.util.Scanner;

public class Ejercicio3NumerosParesEImpares  {
    public static void main(String[] args) {

        int[] numeros = new int[12];
        Scanner teclado = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        System.out.println("--- Registro de 12 Números ---");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n--- Conteo Final ---");
        System.out.println("Cantidad de números PARES: " + pares);
        System.out.println("Cantidad de números IMPARES: " + impares);

        teclado.close();
    }
}

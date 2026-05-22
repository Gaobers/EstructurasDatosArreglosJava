import java.util.Scanner;

public class Ejercicio2PromedioNumeros  {
    public static void main(String[] args) {

        int[] numeros = new int[12];
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        double promedio;

        System.out.println("--- Registro de 12 Números ---");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();

            suma += numeros[i];
        }

        promedio = (double) suma / numeros.length;

        System.out.println("\n--- Resultados ---");
        System.out.println("La suma total de los números es: " + suma);
        System.out.println("El promedio de los números ingresados es: " + promedio);

        teclado.close();
    }
}


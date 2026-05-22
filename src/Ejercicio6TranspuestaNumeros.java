import java.util.Scanner;

public class Ejercicio6TranspuestaNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[][] numeros = new double[3][3];

        for (int fila=0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.println("Ingrese un numero a registrar: ");
                numeros[fila][columna] = teclado.nextDouble();
            }
        }

        //invertir for o println
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.println(numeros[columna][fila]);
            }
        }

        teclado.close();
    }
}

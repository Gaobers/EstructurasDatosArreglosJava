import java.util.Scanner;

public class Ejercicio7PuntoDeSilla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[][] numeros = new double[3][4];

        //recorrido y llenado
        for (int fila=0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.println("Ingrese un numero a registrar: ");
                numeros[fila][columna] = teclado.nextDouble();
            }
        }

        //recorrido punto silla
        for (int filas = 0; filas < numeros.length; filas++){

            double menor = numeros[filas][0];
            int posicionColumnaMenor = 0;

            for (int columnas= 1; columnas < numeros[filas].length; columnas++){
               if (numeros[filas][columnas] < menor){
                   menor = numeros[filas][columnas];
                   posicionColumnaMenor = columnas;
               }
            }

            boolean puntoSilla = true;


            for (int i = 0; i < numeros.length; i++){

                if (numeros[i][posicionColumnaMenor] > menor){
                    puntoSilla = false;

                }
            }

            if (puntoSilla){
                System.out.println("Se encontro un punto silla: " + menor);
                System.out.println("Posición: [" + filas + "][" + posicionColumnaMenor + "]");
            }
        }

        teclado.close();


    }
}

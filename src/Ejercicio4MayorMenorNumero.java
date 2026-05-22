import java.util.Scanner;

public class Ejercicio4MayorMenorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i=0; i < numeros.length; i++){
            System.out.println("Escriba un número: ");
            numeros[i] = teclado.nextDouble();
        }

        double mayor = numeros[0];
        double menor = numeros[0];

        for (int i=0; i < numeros.length; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("El valor maximo ingresado es de: " + mayor);
        System.out.println("El valor minimo ingresado es de: " + menor);

        teclado.close();
    }
}

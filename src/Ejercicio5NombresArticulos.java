import java.util.Scanner;

public class Ejercicio5NombresArticulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        for (int fila=0; fila < articulos.length; fila++) {
            for (int columna = 0; columna < articulos[fila].length; columna++) {
                System.out.println("Ingrese un articulo a registrar: ");
                articulos[fila][columna] = teclado.nextLine();
            }
        }

        for (int fila = articulos.length -1; fila >= 0; fila--){
            for (int columna = 0; columna < articulos[fila].length; columna++){
                System.out.println(articulos[fila][columna]);
            }
        }
        teclado.close();
    }
}

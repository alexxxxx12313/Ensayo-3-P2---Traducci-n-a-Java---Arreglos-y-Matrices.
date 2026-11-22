import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int numero;
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 5; columna++) {

                System.out.print("Ingrese el valor para la fila "
                        + fila + " y columna " + columna + ": ");

                numero = sc.nextInt();

                matriz[fila][columna]
                        = numero + (fila * columna);
            }
        }
        System.out.println("\nMatriz modificada:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}

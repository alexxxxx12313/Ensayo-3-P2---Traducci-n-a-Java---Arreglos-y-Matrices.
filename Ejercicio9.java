import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int mayor;
        int menor;
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Ingrese el valor para la fila "
                        + fila + " y columna " + columna + ": ");

                matriz[fila][columna] = sc.nextInt();
            }
        }
        mayor = matriz[0][0];
        menor = matriz[0][0];
        for (int fila = 0; fila < 5; fila++) {

            for (int columna = 0; columna < 5; columna++) {

                if (matriz[fila][columna] > mayor) {
                    mayor = matriz[fila][columna];
                }
                if (matriz[fila][columna] < menor) {
                    menor = matriz[fila][columna];
                }
            }
        }
        System.out.println("\nMayor valor de la matriz: " + mayor);
        System.out.println("Menor valor de la matriz: " + menor);
        sc.close();
    }
}
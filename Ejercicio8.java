import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese el valor para la fila "
                        + fila + " y columna " + columna + ": ");
                matriz[fila][columna] = sc.nextInt();
            }
        }
        System.out.println("\nElementos de la diagonal principal:");
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                if (fila == columna) {
                    System.out.println("Posición [" + fila + "]["
                            + columna + "]: " + matriz[fila][columna]);

                    sumaDiagonal = sumaDiagonal + matriz[fila][columna];
                }
            }
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        sc.close();
    }
}
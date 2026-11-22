import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                System.out.print("Ingrese el valor para la fila "
                        + fila + " y columna " + columna + ": ");

                matriz[fila][columna] = sc.nextInt();

                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }
        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSuma total de los elementos: " + sumaTotal);
        sc.close();
    }
}
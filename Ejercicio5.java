import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int numero;
        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Ingrese un número positivo para la posición "
                        + i + ": ");
                numero = sc.nextInt();
                if (numero <= 0) {
                    System.out.println("El número debe ser positivo.");
                }
            } while (numero <= 0);
            numeros[i] = numero + i;
        }
        System.out.println("\nArreglo modificado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        sc.close();
    }
}
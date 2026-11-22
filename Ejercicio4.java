import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }
        System.out.println("\nCantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los números impares: " + sumaImpares);
        sc.close();
    }
}

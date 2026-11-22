import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }
        promedio = suma / numeros.length;
        System.out.println("\nSuma total: " + suma);
        System.out.println("Promedio: " + promedio);
        sc.close();
    }
}

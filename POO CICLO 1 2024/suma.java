import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la longitud del arrglo:");
        int longitud = scanner.nextInt();
        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("ingrese el elemento: " + (i + 1) + ":");
            arreglo[i] = scanner.nextInt();

        }

        int suma = 0;
        for (int i = 0; i < longitud; i++) {
            suma = suma + arreglo[i];

        }

        System.out.print("la suma de los numero del arreglo: " + suma);

        scanner.close();

    }

}
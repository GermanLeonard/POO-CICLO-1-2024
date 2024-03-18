import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double num1, num2;
        double resultado;

        System.out.print("ingrese el primer numero: ");
        num1 = scanner.nextDouble();

        System.out.print("ingrese el segundo numero: ");
        num2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("ingrese su nombre: ");
        nombre = scanner.nextLine();

        resultado = suma(num1, num2);
        System.out.print(nombre + " el resultado de su suma es: " + resultado);

        scanner.close();

    }

    public static double suma(double a, double b) {

        return a + b;
    }
}

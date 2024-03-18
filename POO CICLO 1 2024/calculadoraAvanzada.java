import java.util.Scanner;

public class calculadoraAvanzada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        double resultado;
        int opc;

        do {
            System.out.println("1.suma ");
            System.out.println("2.resta ");
            System.out.println("3.multiplicacion ");
            System.out.println("4.division ");
            System.out.println("5.salir ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ingrese numero 1");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese numero 2");
                    num2 = scanner.nextDouble();
                    resultado = suma(num1, num2);
                    System.out.println("su resultado es "+resultado);

                    break;

                case 2:
                    System.out.println("ingrese numero 1");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese numero 2");
                    num2 = scanner.nextDouble();
                    resultado = resta(num1, num2);
                    System.out.println("su resultado es "+resultado);

                    break;

                case 3:
                    System.out.println("ingrese numero 1");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese numero 2");
                    num2 = scanner.nextDouble();
                    resultado = multiplicacion(num1, num2);
                    System.out.println("su resultado es "+resultado);

                    break;

                case 4:
                    System.out.println("ingrese numero 1");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese numero 2");
                    num2 = scanner.nextDouble();
                    resultado = division(num1, num2);
                    System.out.println("su resultado es "+resultado);

                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opc != 5);
        scanner.close();
    }

    public static double suma(double a, double b) {

        return a + b;
    }

    public static double resta(double a, double b) {

        return a - b;
    }

    public static double multiplicacion(double a, double b) {

        return a * b;
    }

    public static double division(double a, double b) {

        return a / b;
    }

}
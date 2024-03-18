import java.util.Scanner;

public class buscar {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int altura;
        System.out.print("ingresa tu altura: ");
        altura=scanner.nextInt();
        int atraciones;
        System.out.print("ingresa la cantidad de atracciones a subirse: ");
        atraciones=scanner.nextInt();
        int[] alturasNecesarias= new int[atraciones];
        int contador=0;

        for(int i=0; i<atraciones;i++){
          System.out.print("ingrese la altura necesaria para la atraccion "+ (i+1));
          alturasNecesarias[i]=scanner.nextInt();

          if (alturasNecesarias[i]>altura) {
            contador++;
          }

        }

        System.out.print("las atracciones a las que te pudes subir es: "+contador);

      

        scanner.close();

    }

}
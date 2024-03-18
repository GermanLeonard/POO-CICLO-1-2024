import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[]args){
     double x;
     double y;
     double z;

     Scanner scanner= new Scanner(System.in);

     System.out.print("ingresa el valor de x: ");
        x=scanner.nextDouble();

     System.out.print("ingresa el valor de y:");
       y=scanner.nextDouble();

       z=Math.sqrt((x*x)+(y*y));
       System.out.println("La hipotenusa es: "+z);
       scanner.close();

    }
    
}

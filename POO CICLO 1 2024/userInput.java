import java.util.Scanner;

public class userInput {

    public static void main(String [] args){

        Scanner scanner= new Scanner(System.in);

        System.out.print("ingresa tu nombre: ");
        String name= scanner.nextLine(); 
        
        System.out.println("hola "+name);

        System.out.print("cual es tu edad "+name+"? ");
        int age= scanner.nextInt();

        System.out.println("la edad de "+ name +" es "+age);
        scanner.close();


    }
    
}

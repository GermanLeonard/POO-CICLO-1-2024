public class Main {
    public static void main(String[] args) {
        Perro perro1= new Perro("Rene",20);
        Gato gato1= new Gato("abraham",23);

        perro1.dormir();
        perro1.mostrarInfo();
        System.out.println("-----------------------------------");

        gato1.dormir();
        gato1.mostrarInfo();




    }
}

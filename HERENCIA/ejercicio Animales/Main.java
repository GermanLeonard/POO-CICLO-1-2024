public class Main {
    public static void main(String[] args) {
        Perro perro1= new Perro("Rene",20);
        Gato gato1= new Gato("abraham",23);


        System.out.println("Mi perro:");
        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Edad: " + perro1.getEdad());
        perro1.emitirSonido();
        perro1.ladrar();
        perro1.comer();
        perro1.jugar();

        System.out.println("\nMi gato:");
        System.out.println("Nombre: " + gato1.getNombre());
        System.out.println("Edad: " + gato1.getEdad());
        gato1.emitirSonido();
        gato1.maullar();
        gato1.comer();
        gato1.dormirEnCaja();


    }
}

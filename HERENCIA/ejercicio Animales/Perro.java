public class Perro extends Animal {
    public Perro(String nombre, int edad){

        super(nombre,edad);
    }

    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    public void perseguirCola() {
        System.out.println("El perro está persiguiendo su cola.");
    }

    public void jugar() {
        System.out.println("El perro esta jugando.");
    }

}

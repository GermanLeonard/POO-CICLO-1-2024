public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar() {
        System.out.println("El gato está maullando.");
    }

    public void afilarGarras() {
        System.out.println("El gato está afilando sus garras.");
    }

    public void dormirEnCaja() {
        System.out.println("El gato esta durmiendo en su caja.");
    }

}

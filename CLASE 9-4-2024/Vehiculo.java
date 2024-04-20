public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

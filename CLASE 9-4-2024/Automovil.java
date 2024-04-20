public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    // Método específico para Automovil
    public void abrirPuertas() {
        System.out.println("Las puertas del automóvil están abiertas.");
    }


}

public class Motocicleta extends Vehiculo{

    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    // Método específico para Motocicleta
    public void encender() {
        System.out.println("La motocicleta está encendida.");
    }
}

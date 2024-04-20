import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de vehículos
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        // Agregar automóviles y motocicletas a la lista
        listaVehiculos.add(new Automovil("Toyota", "Corolla", 4));
        listaVehiculos.add(new Motocicleta("Harley-Davidson", "Sportster", false));

        // Iterar sobre la lista y mostrar información de cada vehículo
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());

            // Verificar el tipo de vehículo y llamar métodos específicos
            if (vehiculo instanceof Automovil) {
                Automovil automovil = (Automovil) vehiculo;
                automovil.abrirPuertas();
            } else if (vehiculo instanceof Motocicleta) {
                Motocicleta motocicleta = (Motocicleta) vehiculo;
                motocicleta.encender();
            }

            // Llamar métodos comunes a todos los vehículos
            vehiculo.acelerar();
            vehiculo.frenar();

            System.out.println(); // Separador entre vehículos
        }
    }

}

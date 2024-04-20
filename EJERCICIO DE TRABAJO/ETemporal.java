import Modelos.Empleado;
import Modelos.Persona;

public class ETemporal extends Empleado {

    public ETemporal(Persona persona, String carnet, float salarioBase) {
        super(persona, carnet, salarioBase);
    }

    public float obtenerSalario() {

        return getSalarioBase();
    }
}
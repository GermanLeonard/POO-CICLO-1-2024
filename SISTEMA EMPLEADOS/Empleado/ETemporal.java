package Empleado;

import Persona.Persona;

public class ETemporal extends Empleado {


    public ETemporal(Persona persona, float salario, int carnet) {
        super(persona,salario,carnet);
    }

    public float obtenerSalario() {
        return getSalario();
    }
}

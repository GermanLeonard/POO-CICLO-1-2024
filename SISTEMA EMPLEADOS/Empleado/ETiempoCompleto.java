package Empleado;

import Persona.Persona;

public class ETiempoCompleto extends Empleado {

    public ETiempoCompleto(Persona persona, float salario,int carnet) {
        super (persona, salario, carnet);
    }

    public float obtenerSalario() {
        return getSalario();
    }
}

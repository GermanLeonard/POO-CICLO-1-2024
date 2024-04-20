package Empleado;

import Persona.Persona;

public abstract class Empleado extends Persona {
    private float salario;
    private int carnet;

    public Empleado(Persona persona, float salario, int carnet){
        super(persona);
        this.salario = salario;
        this.carnet = carnet;
    }

    public abstract float obtenerSalario();


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
}

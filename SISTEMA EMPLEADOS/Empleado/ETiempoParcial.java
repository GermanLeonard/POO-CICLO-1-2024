package Empleado;

import Persona.Persona;

public class ETiempoParcial extends Empleado implements PagoPorHoras{
    private int horas;
    public ETiempoParcial(Persona persona, float salario, int carnet, int horas) {
        super(persona, salario, carnet);
        this.horas = horas;
    }

    public float CalcularSalario(int horas) {
        return getSalario() * horas;
    }

    public float obtenerSalario() {

        return CalcularSalario(horas);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}

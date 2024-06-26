package Modelos;

public abstract class Empleado extends Persona {
    private String carnet;
    private float salarioBase;

    public Empleado(Persona persona, String carnet, float salarioBase){
        super(persona);
        setCarnet(carnet);
        setSalarioBase(salarioBase);

    }

    public abstract float obtenerSalario();

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}

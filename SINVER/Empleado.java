public abstract class Empleado extends Persona{
    float SalarioBase;
    int carnet;

    public Empleado(Persona persona, float SalarioBase, int carnet){
        super(persona);
        this.SalarioBase = SalarioBase;
        this.carnet = carnet;
    }

    public abstract float obtenerSalario();

    public float getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        SalarioBase = salarioBase;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
}

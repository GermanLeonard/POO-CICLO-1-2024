import Modelos.Empleado;
import Modelos.Persona;

public class ETiempoParcial extends Empleado implements PagoPorHoras{
    private int horasBase;

    public ETiempoParcial(Persona persona, String carnet, float salarioBase, int horasBase){
        super(persona, carnet, salarioBase);
        this.horasBase = horasBase;
    }

    public float obtenerSalario() {
        return calcularSalario(horasBase);
    }
    public float calcularSalario(int horasTrabajadas) {
        return horasTrabajadas*getSalarioBase();
    }

    public int getHorasBase() {
        return horasBase;
    }

    public void setHorasBase(int horasBase) {
        this.horasBase = horasBase;
    }
}
import Modelos.Empleado;
import Modelos.Persona;

public class ETiempoCompleto extends Empleado {

    public ETiempoCompleto(Persona persona, String carnte, float SalarioBase){
        super(persona, carnte, SalarioBase);
    }

    public float obtenerSalario(){
        return getSalarioBase();
    }
}

public class EmpleadoFijo extends Empleado{
    public EmpleadoFijo(Persona persona, float SalarioBase,int carnet){
        super(persona,SalarioBase,carnet);
    }

    public float obtenerSalario(){
        return SalarioBase;
    }
}

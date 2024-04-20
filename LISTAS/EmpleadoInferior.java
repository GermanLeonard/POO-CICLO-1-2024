public class EmpleadoInferior extends Empleado{
    public EmpleadoInferior(Persona persona, int carnet, int aniosTrabajando,float salario,int horasTrabajando,String cargo){
        super(persona, carnet, aniosTrabajando, salario, horasTrabajando, cargo);
    }

    public float CalcularSalario(){
        return getSalario()*getHorasTrabajando();

    }
}

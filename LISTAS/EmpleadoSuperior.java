public class EmpleadoSuperior extends Empleado {

    public EmpleadoSuperior(Persona persona, int carnet,int aniosTrabajando,float salario,int horasTrabajando,String cargo) {
        super(persona,carnet,aniosTrabajando,salario,horasTrabajando,cargo);
    }

    public float CalcularSalario(){
        return (getSalario()*getHorasTrabajando())+1000;

    }


}

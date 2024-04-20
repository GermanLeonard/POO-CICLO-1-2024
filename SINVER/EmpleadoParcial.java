public class EmpleadoParcial extends Empleado implements PagoPorHoras{
    private int horasTrabajadas;

    public EmpleadoParcial(Persona persona, float SalarioBase, int carnet, int horasTrabajadas) {
        super(persona, SalarioBase, carnet);
        this.horasTrabajadas = horasTrabajadas;
    }


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public float obtenerSalario(){
        return CalcularSalario(horasTrabajadas);
    }

    public float CalcularSalario(int horasTrabajadas) {
        return SalarioBase*horasTrabajadas;

    }



}

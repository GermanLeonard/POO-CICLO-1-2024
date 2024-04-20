public abstract class Empleado extends Persona{

    private int carnet;
    private int aniosTrabajando;
    private float salario;
    private int horasTrabajando;
    private String cargo;

    Empleado(Persona persona,int carnet, int aniosTrabajando, float salario, int horasTrabajando, String cargo){
        super(persona);
        this.carnet = carnet;
        this.aniosTrabajando = aniosTrabajando;
        this.salario = salario;
        this.horasTrabajando = horasTrabajando;
        this.cargo = cargo;
    }

    public abstract float CalcularSalario();

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getAniosTrabajando() {
        return aniosTrabajando;
    }

    public void setAniosTrabajando(int aniosTrabajando) {
        this.aniosTrabajando = aniosTrabajando;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHorasTrabajando() {
        return horasTrabajando;
    }

    public void setHorasTrabajando(int horasTrabajando) {
        this.horasTrabajando = horasTrabajando;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

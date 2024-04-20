public class Profesosr extends Persona implements usuario {
    private String CarreraImpartida;
    private int numeroProfesor;

    public Profesosr(String nombre, String apellido, int edad, String CarreraImpartida, int numeroProfesor){
        super(nombre, apellido, edad);
        this.CarreraImpartida = CarreraImpartida;
        this.numeroProfesor = numeroProfesor;
    }

    public String getCarreraImpartida() {
        return CarreraImpartida;
    }

    public void setCarreraImpartida(String carreraImpartida) {
        CarreraImpartida = carreraImpartida;
    }

    public int getNumeroProfesor() {
        return numeroProfesor;
    }

    public void setNumeroProfesor(int numeroProfesor) {
        this.numeroProfesor = numeroProfesor;
    }

    public void PedirPrestamo(MaterialBibliografico material){
        material.prestar();
    }

    public void devolverPrestamo(MaterialBibliografico material){
        material.devolver();
    }
}

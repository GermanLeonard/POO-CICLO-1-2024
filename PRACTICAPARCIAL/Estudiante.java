public class Estudiante extends Persona implements usuario {

    private int numeroEstudiante;
    private String carrera;

    public Estudiante(String nombre,String apellido,int edad,int numeroEstudiante,String carrera) {
        super(nombre,apellido,edad);
        this.numeroEstudiante=numeroEstudiante;
        this.carrera=carrera;

    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void PedirPrestamo(MaterialBibliografico material){
        material.prestar();

    }

    public void devolverPrestamo(MaterialBibliografico material){
        material.devolver();
    }
}
package Persona;

public class Persona {
    private String nombre;
    private String DUI;
    private int edad;

    public Persona(String nombre, String DUI, int edad){
        this.nombre = nombre;
        this.DUI = DUI;
        this.edad = edad;
    }

    public Persona(Persona persona){
        nombre= persona.nombre;
        DUI= persona.DUI;
        edad= persona.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }
}

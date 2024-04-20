public class Persona {
    private String DUI;
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String DUI, String nombre, int edad, String sexo ){
        this.DUI=DUI;
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    public Persona(Persona persona){
        DUI=persona.DUI;
        nombre= persona.nombre;
        edad= persona.edad;
        sexo= persona.sexo;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

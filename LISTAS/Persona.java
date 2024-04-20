public class Persona {
    private String nombre;
    private int edad;
    private String altura;
    private String sexo;

    public Persona(String nombre, int edad, String altura, String sexo){
        this.nombre= nombre;
        this.edad=edad;
        this.altura=altura;
        this.sexo=sexo;
    }

    public Persona(Persona persona){
        nombre=persona.nombre;
        edad= persona.edad;
        altura= persona.altura;
        sexo= persona.sexo;
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

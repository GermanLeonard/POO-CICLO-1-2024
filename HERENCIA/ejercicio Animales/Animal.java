public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int  edad){

        this.nombre=nombre;
        this.edad=edad;
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

    public void emitirSonido(){
        System.out.println("grrrrrrr");
    }

    public void comer(){
        System.out.println("comiendo...");
    }

    public void dormir(){
        System.out.println("durmiendo...");
    }

    public void mostrarInfo(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
    }
}

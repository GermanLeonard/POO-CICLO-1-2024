package Producto;

public  class Producto {
    private String nombre;
    private float peso;
    private int codigo;
    float precio;

    public Producto(String nombre, float peso, int codigo,float precio){
        this.nombre= nombre;
        this.peso= peso;
        this.codigo= codigo;
        this.precio= precio;

    }

    public Producto(Producto p){
        nombre=p.nombre;
        peso=p.peso;
        codigo=p.codigo;
        precio=p.precio;
    }

    public float obtenerPrecio(){
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

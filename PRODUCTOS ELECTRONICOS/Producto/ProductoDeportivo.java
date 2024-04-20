package Producto;

public class ProductoDeportivo extends Producto implements Precio {

    private String descripcion;
    private float Descuento;

    public ProductoDeportivo(Producto producto, String descripcion, float descuento) {
        super(producto);
        this.descripcion = descripcion;
        this.Descuento = descuento;
    }

    public float CalcularPrecio(float Descuento){
        return precio - (precio * (Descuento / 100));
    }

    public float obtenerPrecio(){
        return CalcularPrecio(Descuento);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float descuento) {
        Descuento = descuento;
    }
}

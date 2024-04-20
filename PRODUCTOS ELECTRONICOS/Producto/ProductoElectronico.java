package Producto;

public class ProductoElectronico extends Producto {
    String descripcion;

    public ProductoElectronico(Producto producto, String descripcion) {
        super(producto);
        this.descripcion = descripcion;
    }

    public float obtenerPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

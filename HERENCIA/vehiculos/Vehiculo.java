public class Vehiculo {
    private String marca;
    private String modelo;
    private int anoFabricacion;

    public Vehiculo(String marca, String modelo, int anoFabricacion) {
        this.marca = marca;
        this.modelo= modelo;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public void mostrarInfo(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + anoFabricacion);
    }
}

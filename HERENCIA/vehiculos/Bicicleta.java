public class Bicicleta extends Vehiculo{

    private int numMarchas;
    private boolean tieneFrenoDisco;

    public Bicicleta(String marca, String modelo, int anoFabricacion, int numMarchas, boolean tieneFrenoDisco) {
        super(marca, modelo, anoFabricacion);
        this.numMarchas = numMarchas;
        this.tieneFrenoDisco = tieneFrenoDisco;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isTieneFrenoDisco() {
        return tieneFrenoDisco;
    }

    public void setTieneFrenoDisco(boolean tieneFrenoDisco) {
        this.tieneFrenoDisco = tieneFrenoDisco;
    }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Marchas: " + numMarchas);
        System.out.println("Tiene Freno de Disco: " + (tieneFrenoDisco ? "Sí" : "No"));
    }
}

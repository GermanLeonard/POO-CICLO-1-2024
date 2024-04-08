public class Automovil extends Vehiculo {

    private int numPuertas;
    private  String tipoCombustible  ;

   public Automovil(String marca, String modelo, int anoFabricacion,int numPuertas, String tipoCombustible) {

       super(marca, modelo, anoFabricacion);
       this.numPuertas = numPuertas;
       this.tipoCombustible = tipoCombustible;
   }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

   public void mostrarInfo(){
       super.mostrarInfo();
       System.out.println("Numero de puertas: " + numPuertas);
       System.out.println("Tipo de combustible: " + tipoCombustible);
   }
}

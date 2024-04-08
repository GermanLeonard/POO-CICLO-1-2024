public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: "+ area );
    }
}

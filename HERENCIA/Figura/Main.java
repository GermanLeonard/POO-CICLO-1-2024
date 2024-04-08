public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo = new Circulo(3);

        cuadrado.calcularArea(); // Se llamará al método sobrescrito en Cuadrado
        circulo.calcularArea();  // Se llamará al método sobrescrito en Circulo
    }
}
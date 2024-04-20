public class Revista extends MaterialBibliografico{
    private int numero;

    public Revista(String titulo, boolean prestado, int numero){
        super(titulo, prestado);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

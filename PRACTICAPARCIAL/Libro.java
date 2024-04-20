public class Libro extends MaterialBibliografico{
    private String autor;

    public Libro(String titulo, boolean prestado, String autor){
        super(titulo, prestado);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

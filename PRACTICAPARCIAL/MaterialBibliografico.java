public abstract class MaterialBibliografico {
    private String titulo;
    private boolean prestado;

    public MaterialBibliografico(String titulo, boolean prestado){
        this.titulo = titulo;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Se ha prestado el material: " + titulo);
        } else {
            System.out.println("El material ya está prestado: " + titulo);
        }
    }

    public void devolver(){
        if(!prestado){
            prestado= false;
            System.out.println("Se ha devuelto el libro : " + titulo);
        }else{
            System.out.println("el material "+titulo+" no estaba prestado");
        }
    }
}

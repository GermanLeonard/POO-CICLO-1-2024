public class Main {

    public static void main(String[]args){
        Libro libro1= new Libro(" Harry potter", true,"German Sanchez");
        Revista revista1 = new Revista(" La liga", false, 123);

        Estudiante estudiante1 = new Estudiante("rene", " Guzman", 20, 110022,"informatica");
        Profesosr profesor1= new Profesosr("enmanuel", "sanchez",34,"POO",1223);

        estudiante1.PedirPrestamo(revista1);
        System.out.println("--------------------------");

        profesor1.devolverPrestamo(libro1);
    }

}

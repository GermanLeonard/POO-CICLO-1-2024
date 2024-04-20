import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();

    public static void main(String[]args){
        mostrarMenu();


    }

    private static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Modificar el sueldo");
            System.out.println("3. Mostrar la lista de empleados");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        agregarEmpleado();
                        break;
                    case 2:
                        modificarSalarioEmpleado();

                        break;
                    case 3:
                        mostrarListaEmpleados();
                        break;
                    case 4:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Opcion no valida. Por favor, ingrese un número del 1 al 4.");
                }
            } else {
                System.out.println("Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer de entrada
                opcion = 0; // Asignar un valor por defecto para evitar un bucle infinito
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void agregarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;
        String altura;
        String sexo;

        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su altura: ");
        altura = scanner.nextLine();
        System.out.println("ingrese su sexo:");
        sexo = scanner.nextLine();

        Persona persona= new Persona(nombre, edad, altura, sexo);

        int carnet;
        int aniosTrabajando;
        float salario;
         int horasTrabajando;
         String cargo;

        System.out.println("ingrese su cargo:");
        cargo = scanner.nextLine();
        System.out.println("ingrese su aniosTrabajando:");
        aniosTrabajando = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese su salario:");
        salario = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("ingrese su carnet de empleado:");
        carnet = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese sus horas al mes");
        horasTrabajando = scanner.nextInt();
        scanner.nextLine();

        int tipoEmpleado=obtenerTipoEmpleado();

        Empleado empleado=null;

        switch (tipoEmpleado){

            case 1:
                empleado= new EmpleadoSuperior(persona,carnet,aniosTrabajando,salario,horasTrabajando,cargo);
                break;


            case 2:
                empleado= new EmpleadoInferior(persona,carnet,aniosTrabajando,salario,horasTrabajando,cargo);
                break;
        }

        System.out.println("\nEmpleado agregado exitosamente...\n");

        listaEmpleados.add(empleado);


    }


    private static int obtenerTipoEmpleado() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while (true) {
            try{
                System.out.println("Seleccione una opcion:\n"
                        + "\t1. Empleado superior\n"
                        + "\t2. Empleado inferior\n"

                );
                System.out.print("Opcion -> ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 2) return opcion;
                System.out.println("\nPor favor ingrese una opcion valida\n");
            }catch(Exception e){
                System.out.println("\nPor favor ingrese un dato valido\n");
            }finally {
                sn.nextLine();
            }
        }



    }

    private static void mostrarListaEmpleados() {
        System.out.println("\n#\t|Nombre\t\t\t|cargo\t|sexo\t|Salario");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado emp = listaEmpleados.get(i);
            System.out.println(
                    (i+1)
                            +"\t|"+emp.getNombre()
                            +"\t|"+emp.getCargo()
                            +"\t|"+emp.getSexo()
                            +"\t|$"+emp.CalcularSalario()
            );
        }
        System.out.println("\n");
    }

    private static void modificarSalarioEmpleado() {
        Scanner sn = new Scanner(System.in);
        //Pidiendo el carnet del empleado a modificar
        System.out.println("Ingrese el carnet del empleado a modificar:");
        int carnet = sn.nextInt();

        //Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i < listaEmpleados.size(); i++) {
            //Evaluando si el empleado actual coincide con el carnet
            if (listaEmpleados.get(i).getCarnet()==carnet){
                //Si coincide se solicita el nuevo salario concatenando el nombre del empleado
                System.out.print("\nIngrese el nuevo salario de "+listaEmpleados.get(i).getNombre()+" en USD: $");
                float nuevoSalario = sn.nextFloat();

                //Se reasigna el salario
                listaEmpleados.get(i).setSalario(nuevoSalario);

                //Se imprime
                System.out.println("\nSalario de "+listaEmpleados.get(i).getNombre()+" actualizado exitosamente...\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }else{
                System.out.println("carnet no encontrado");
            }
        }
    }
}

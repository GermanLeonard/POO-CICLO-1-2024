import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    static ArrayList<Empleado>listaEmpleados= new ArrayList<Empleado>();
    public static void main(String[] args) {

        MostrarMenu();

    }

    private static void MostrarMenu(){
        Scanner sc = new Scanner(System.in);

        int opc;

        do {
            System.out.println("bienvenido al sistema");
            System.out.println("1. agregar empleado");
            System.out.println("2. modificar Salario");
            System.out.println("3. mostrar lista de empleados");
            System.out.println("4. salir : ");
            opc = sc.nextInt();

            switch (opc){

                case 1:
                    AgregarEmpleado();

                    break;


                case 2:
                    modificarSalario();

                    break;


                case 3:
                    MostrarEmpleados();
                    break;


                default:

                    break;

            }

        }while (opc!=4);
    }

    private static void AgregarEmpleado(){
        Scanner sc = new Scanner(System.in);
        int tipoEmpleado;
        Empleado empleado= null;

        String DUI;
        String nombre;
        int edad;
        String sexo;

        System.out.println("ingrese el dui del empleado");
        DUI = sc.nextLine();
        System.out.println("ingrese el nombre del empleado");
        nombre = sc.nextLine();
        System.out.println("ingrese el edad del empleado");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el sexo del empleado");
        sexo = sc.nextLine();

        Persona persona = new Persona(DUI,nombre,edad,sexo);

        float salario;
        int carnet;

        System.out.println("ingrese el salario base del empleado:");
        salario = sc.nextFloat();
        sc.nextLine();
        System.out.println("ingrese el carnet del empleado:");
        carnet = sc.nextInt();

        System.out.println("ingrese tipo de empleado");
        System.out.println("1. empleado fijo");
        System.out.println("2. empleado temporal");
        tipoEmpleado = sc.nextInt();

        if(tipoEmpleado==1){
            empleado = new EmpleadoFijo(persona, salario, carnet);
        }if(tipoEmpleado==2){
            int HorasBase;
            System.out.println("ingrese sus horas bases");
            HorasBase = sc.nextInt();
            empleado= new EmpleadoParcial(persona, salario, carnet, HorasBase);
        }

        listaEmpleados.add(empleado);
        System.out.println("el empleado "+nombre+" ha sido agregado");


    }

    private static void MostrarEmpleados(){
        for (int i = 0; i<listaEmpleados.size(); i++){
            Empleado empleado= listaEmpleados.get(i);
            System.out.println("nombre del empleado : "+empleado.getNombre());
            System.out.println("edad del empleado : "+empleado.getEdad());
            System.out.println("sexo del empleado : "+empleado.getSexo());
            System.out.println("salario del empleado: "+empleado.obtenerSalario());
            System.out.println("--------------------------------------------");

        }

    }

    private static void modificarSalario(){
        Scanner sc= new Scanner(System.in);
        int carnet;
        System.out.println("ingrese el carnet del empleado:");
        carnet=sc.nextInt();

        for(int i=0; i<listaEmpleados.size(); i++){

            if(carnet==listaEmpleados.get(i).getCarnet()){
                System.out.println("ingrese el nuevo salario: $");
                float nuevoSalario = sc.nextFloat();

                listaEmpleados.get(i).setSalarioBase(nuevoSalario);

                System.out.println("\nSalario de "+listaEmpleados.get(i).getNombre()+" actualizado exitosamente...\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }
        }

    }
}

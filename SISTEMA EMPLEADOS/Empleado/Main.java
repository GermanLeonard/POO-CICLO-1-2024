package Empleado;
import Persona.Persona;

import javax.sound.midi.spi.SoundbankReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Empleado>ListaEmpleados= new ArrayList<Empleado>();

    public static void main(String []args){
        Menu();
    }

    private static void Menu(){
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("BIENVENIDO AL SISTEMA");
            System.out.println("1. agregar empleado");
            System.out.println("2. modificar Salario");
            System.out.println("3. mostrar empleados");
            System.out.println("4. salir");
            opc= sc.nextInt();
            sc.nextLine();

            switch (opc){

                case 1:
                    AgregarEmpleado();
                    break;

                case 2:
                    CambiarSalario();
                    break;

                case 3:
                    MostrarLista();
                    break;

                case 4:
                    System.out.println("saliendo del sistema");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while (opc!=4);
    }

    private static void AgregarEmpleado(){
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        String nombre;
         String DUI;
         int edad;

        System.out.println("Ingrese el nombre del empleado");
        nombre= sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el edad del empleado");
        edad= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el dui del empleado");
        DUI= sc.nextLine();

        Persona persona = new Persona(nombre,DUI,edad);

         float salario;
         int carnet;

        System.out.println("Ingrese el salario del empleado");
        salario= sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese el carnet del empleado");
        carnet= sc.nextInt();
        sc.nextLine();

        int tipoEmpleado= obtenerTipoEmpleado();

        switch (tipoEmpleado){
            case 1:
                empleado = new ETiempoCompleto(persona,salario,carnet);
                break;

            case 2:
                System.out.println("ingrese las horas al mes que trabaja:");
                int horas= sc.nextInt();
                sc.nextLine();

                empleado= new ETiempoParcial(persona,salario,carnet,horas);
                break;

            case 3:
                empleado= new ETemporal(persona,salario,carnet);
                break;

        }

        ListaEmpleados.add(empleado);
        System.out.println("el empleado "+empleado.getNombre()+" ha sido agregado correctamente");


    }

    private static void MostrarLista(){
        if(ListaEmpleados.isEmpty()){
            System.out.println("No hay empleados en los registos ");


        }else{
            for (int i =0; i<ListaEmpleados.size(); i++){
                System.out.println("nombre:"+ListaEmpleados.get(i).getNombre());
                System.out.println("edad:"+ListaEmpleados.get(i).getEdad());
                System.out.println("salario:"+ListaEmpleados.get(i).obtenerSalario());
                System.out.println("carnet:"+ ListaEmpleados.get(i).getCarnet());
                System.out.println("-----------------------------------------------");
            }
        }
    }

    private static void CambiarSalario(){
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese el carnet del empleado:");
        int carnet=sc.nextInt();
        sc.nextLine();

        for (int i =0; i<ListaEmpleados.size(); i++){
            if(carnet==ListaEmpleados.get(i).getCarnet()){
                System.out.println("ingresa el nuevo salario");
                int nueevoSalario= sc.nextInt();
                sc.nextLine();
                ListaEmpleados.get(i).setSalario(nueevoSalario);
            }else{
                System.out.println("este carnet no existe");
            }
        }
    }

    private static int obtenerTipoEmpleado() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true) {
            try {
                System.out.println("Seleccione el tipo de empleado:");
                System.out.println("1.Empleado Tiempo Completo");
                System.out.println("2.Empleado Tiempo Parcial");
                System.out.println("3.Empleado Temporal");
                System.out.print("Opcion > ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 3) return opcion;
                System.out.println("Ingrese una opcion valida");
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
            }
            sn.nextLine();
        }

    }

    //static void menuPrincipal(){
    //
    //        Scanner sn = new Scanner(System.in);
    //        int opcion;
    //        while(true){
    //            mostrarMenuPrincipal();
    //            try{
    //                opcion = sn.nextInt();
    //                sn.nextLine();
    //
    //                if(opcion == 0) {
    //                    System.out.println("Hasta pronto...");
    //                    break;
    //                }
    //
    //                switch (opcion){
    //                    case 1:
    //                        agregarEmpleado();
    //                        break;
    //                    case 2:
    //                        modificarSalarioEmpleado();
    //                        break;
    //                    case 3:
    //                        eliminarEmpleado();
    //                        break;
    //                    case 4:
    //                        mostrarDatosEmpleado();
    //                        break;
    //                    case 5:
    //                        mostrarReportesDeEmpleados();
    //                        break;
    //                    default:
    //                        System.out.println("\nPor favor, ingrese una opcion valida.\n");
    //                        break;
    //                }
    //            }catch (InputMismatchException e){
    //                sn.nextLine();
    //                System.out.println("\nPor favor, ingrese una opcion valida.\n");
    //            }
    //        }
    //
    //    }
    //


    // static void mostrarMenuPrincipal(){
    //        System.out.println("Seleccione una opcion:\n"
    //            + "\t1. Agregar Empleado\n"
    //            + "\t2. Modificar Salario de Empleado\n"
    //            + "\t3. Eliminar Empleado\n"
    //            + "\t4. Mostrar reporte de Empleado\n"
    //            + "\t5. Mostrar reporte de todos los Empleado\n"
    //            + "\t0. Salir\n"
    //        );
    //        System.out.print("Opcion > ");
    //    }
}
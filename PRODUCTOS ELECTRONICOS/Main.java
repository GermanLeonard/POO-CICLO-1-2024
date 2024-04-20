import Producto.Producto;
import Producto.ProductoDeportivo;
import Producto.ProductoElectronico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<ProductoDeportivo> ListaDeportiva= new ArrayList<ProductoDeportivo>();
    static ArrayList<ProductoElectronico> ListaElectronicos= new ArrayList<ProductoElectronico>();

    public static void main(String []args){
        Menu();


    }

    private static void Menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1. Agregar Producto.Producto Deportivo");
            System.out.println("2. Agregar Producto.Producto Electronico");
            System.out.println("3. Mostrar Productos Deportivos");
            System.out.println("4. Mostrar Productos Electronicos");
            System.out.println("5. modificar precio de producto Deportivo");
            System.out.println("6. modificar precio de producto Electronico");
            System.out.println("7. Salir:");
            opc=sc.nextInt();

            switch (opc){
                case 1:
                    AgregarProductoDeportivo();
                    break;

                case 2:
                    AgregarProductoElectronico();
                    break;

                case 3:
                    mostrarListaDeportiva();

                    break;

                case 4:
                    mostrarListaElectronicos();
                    break;

                case 5:
                    ModificarPrecioDeportivo();
                    break;

                case 6:
                    ModificarPrecioElectronico();
                    break;

                case 7:
                    System.out.println("saliendo del sistema......");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opc!=7);
    }

    private static void AgregarProductoDeportivo(){
        Scanner sc = new Scanner(System.in);


         String nombre;
         float peso;
        int codigo;
        float precio;
        String descripcion;
       float Descuento;

        System.out.println("ingrese el nombre del producto:");
        nombre=sc.nextLine();
        System.out.println("ingrese el peso del producto:");
        peso=sc.nextFloat();
        sc.nextLine();
        System.out.println("ingrese el codigo del producto:");
        codigo=sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el precio del producto:");
        precio=sc.nextFloat();
        sc.nextLine();

        Producto p = new Producto(nombre,peso,codigo,precio);

        System.out.println("ingrese la descripcion del producto:");
        descripcion=sc.nextLine();
        System.out.println("ingrese el Descuento del producto:");
        Descuento=sc.nextFloat();
        sc.nextLine();

        ProductoDeportivo deportivo= new ProductoDeportivo(p,descripcion,Descuento);

        ListaDeportiva.add(deportivo);
        System.out.println("el producto "+nombre+" ha sido agregado a los Productos Deportivos");


    }

    private static void AgregarProductoElectronico(){

        Scanner sc = new Scanner(System.in);


        String nombre;
        float peso;
        int codigo;
        float precio;
        String descripcion;
        float Descuento;

        System.out.println("ingrese el nombre del producto:");
        nombre=sc.nextLine();
        System.out.println("ingrese el peso del producto:");
        peso=sc.nextFloat();
        sc.nextLine();
        System.out.println("ingrese el codigo del producto:");
        codigo=sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el precio del producto:");
        precio=sc.nextFloat();
        sc.nextLine();

        Producto p = new Producto(nombre,peso,codigo,precio);

        System.out.println("ingrese la descripcion del producto:");
        descripcion=sc.nextLine();


        ProductoElectronico electronico = new ProductoElectronico(p,descripcion);


        ListaElectronicos.add(electronico);
        System.out.println("el producto "+nombre+" ha sido agregado a los Productos Electronicos");


    }

    private static void mostrarListaDeportiva(){
        for(int i=0; i <ListaDeportiva.size();i++){
            ProductoDeportivo deportivo = ListaDeportiva.get(i);
            System.out.println("nombre:" +deportivo.getNombre());
            System.out.println("precio Normal:" +deportivo.getPrecio());
            System.out.println("Descuento:" +deportivo.getDescuento());
            System.out.println("Precio Con descuento:"+deportivo.obtenerPrecio());
            System.out.println("--------------------------------------------------");

        }
    }

    private static void mostrarListaElectronicos(){
        for(int i=0; i <ListaElectronicos.size();i++){
            ProductoElectronico electronico = ListaElectronicos.get(i);
            System.out.println("nombre:" +electronico.getNombre());
            System.out.println("precio Normal:" +electronico.getPrecio());
            System.out.println("Precio Con descuento:"+electronico.obtenerPrecio());
            System.out.println("--------------------------------------------------");

        }
    }

    private static void ModificarPrecioDeportivo(){
        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.println("ingrese el codigo del producto que desea buscar");
        codigo = sc.nextInt();

        for(int i=0; i<ListaDeportiva.size();i++){

            if (codigo == ListaDeportiva.get(i).getCodigo()){
                System.out.println("ingresa el nuevo precio para el producto");
                int nuevoPrecio = sc.nextInt();

                ListaDeportiva.get(i).setPrecio(nuevoPrecio);
                System.out.println("el precio de "+ ListaDeportiva.get(i).getNombre()+" ha sido actualizado correctamente");
            }else{
                System.out.println("codigo no encontrado");
            }
        }

    }

    private static void ModificarPrecioElectronico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el codigo del producto que buscas: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        for(int i=0; i <ListaElectronicos.size();i++){
            if(codigo==ListaDeportiva.get(i).getCodigo()){
                System.out.println("ingresa el nuevo precio: $");
                float nuevoPrecio=sc.nextFloat();

                ListaElectronicos.get(i).setPrecio(nuevoPrecio);
                System.out.println("el precio del articulo"+ ListaElectronicos.get(i).getNombre()+" ha sido actualizado con exito");
            }else{
                System.out.println("el codigo que buscas no existe");
            }
        }
    }
}

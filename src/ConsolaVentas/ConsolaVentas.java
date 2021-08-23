
package ConsolaVentas;

import java.util.Scanner;


public class ConsolaVentas {

    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int seleccion = 0;
           
            System.out.println("                   Bienvenido al sistema de ventas Don Diego");
            System.out.println("                          Favor ingresar credenciales");
            System.out.println("Ingresar usuario:");
            System.out.println("Ingresar contraseña:");
            
        System.out.println("*****************BIENVENIDO AL MENU DE OPCIONES!*****************");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Venta nueva");
        System.out.println("2. Consultar inventarios");
        System.out.println("3. Cambiar contraseña");
        System.out.println("4. Salir");
        
        while(seleccion!=4){
            try{
                System.out.println("Seleccione el número de la acción a ejecutar");
                seleccion = in.nextInt();
            switch(seleccion){
            
                case 1:
                    System.out.println("1- huevos c/u $0.10");
                    System.out.println("2- pollo c/u $5.00");
                    System.out.println("3- aceite c/u $3.00");
                    System.out.println("4- fósforos c/u $0.50");
                    System.out.println("5- dulces c/u $ 0.80");
                    System.out.println("6- margarina c/u $0.30");
                    System.out.println("7- jabón c/u $ 2.25");
                    System.out.println("8- carne c/u $ 2.75");
                    System.out.println("9- gaseosa c/u $1.80");
                    System.out.println("10- desechables c/u $3.25");
                    break;
                case 2:
                    System.out.println("PRODUCTO    CANTIDAD");
                    System.out.println("1- huevos       30");
                    System.out.println("2- pollo         5");
                    System.out.println("3- aceite       60");
                    System.out.println("4- fósforos    100");
                    System.out.println("5- dulces      500");
                    System.out.println("6- margarina    20");
                    System.out.println("7- jabón        25");
                    System.out.println("8- carne        30");
                    System.out.println("9- gaseosa     180");
                    System.out.println("10- desechables 50");
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Cerrando sesión... ¡Regresa pronto!");
                    break;
                default:
                    System.out.println("Acción no valida");
            }
            }catch(Exception datoErroneo){
                 System.out.println("Debe seleccionar una acción");
                 in.next();
            }
            }
    }
    
}

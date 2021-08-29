/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.clases;

import java.util.Scanner;

/**
 *
 * @author rjcha
 */
public class usuarios {

    private Scanner teclado;
    private String usuario;
    private String clave;
    private String nivel;
    int i;

    public usuarios() {
    }

    public usuarios(String usuario, String clave, String nivel) {
        this.usuario = usuario;
        this.clave = clave;
        this.nivel = nivel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Bienvenido al sistema de ventas Don Diego\n");
        System.out.print("Favor ingresar credenciales\n");
        do {
            System.out.print("Ingrese su usuario: ");
            usuario = teclado.next();
            System.out.print("Ingrese su clave: ");
            clave = teclado.next();
            if (usuario.isEmpty() || clave.isEmpty()) {
                System.out.print("Error, Campos sin rellenar");
            } else {
                if (usuario.equals("admin") && clave.equals("admin123")) {
                    System.out.print("Bienvenido " + usuario);
                    int i = 0;
                    menu();
                } else {
                    if (usuario.equals("vendedor") && clave.equals("vendedor123")) {
                        System.out.print("Bienvenido " + usuario);
                        i = 0;
                        menu();
                    } else {
                        if (usuario.equals("invitado") && clave.equals("invitado123")) {
                            System.out.print("Bienvenido " + usuario);
                            i = 0;
                            menu();
                        } else {
                            System.out.print("Error, su Usuario o Contraseña son incorrectos");
                        }
                    }
                }
            }
        } while (i > 0);

    }

    public void menu() {
        int seleccion = 0;
        System.out.println("\n*****************BIENVENIDO AL MENU DE OPCIONES!*****************");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Venta nueva");
        System.out.println("2. Consultar inventarios");
        System.out.println("3. Cambiar contraseña");
        System.out.println("4. Salir");

        while (seleccion != 4) {
            try {
                System.out.println("Seleccione el número de la acción a ejecutar");
                seleccion = teclado.nextInt();
                switch (seleccion) {

                    case 1:
                        Catalogo catalogo1 = new Catalogo();
                        catalogo1.imprimir();
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
            } catch (Exception datoErroneo) {
                System.out.println("Debe seleccionar una acción");
                teclado.next();
            }
        }
    }
}

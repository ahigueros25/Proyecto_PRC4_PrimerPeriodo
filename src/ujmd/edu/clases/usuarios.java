/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.clases;

import com.sun.media.jfxmediaimpl.MediaDisposer;
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
    int i=0;

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
        System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar credenciales");
        do {
            System.out.println("Ingrese su usuario: ");
            usuario = teclado.next();
            System.out.println("Ingrese su clave: ");
            clave = teclado.next();
            if (usuario.isEmpty() || clave.isEmpty()) {
                System.out.println("Error, Campos sin rellenar");
            } else {
                if (usuario.equals("admin") && clave.equals("admin123")) {
                    System.out.println("Bienvenido " + usuario);
                    i++;
                    menu();
                } else {
                    if (usuario.equals("vendedor") && clave.equals("vendedor123")) {
                        System.out.println("Bienvenido " + usuario);
                        i++;
                        menu();
                    } else {
                        if (usuario.equals("invitado") && clave.equals("invitado123")) {
                            System.out.println("Bienvenido " + usuario);
                            i++;
                            menu();
                        } else {
                            System.out.println("Error, su Usuario o Contraseña son incorrectos");
                        }
                    }
                }
            }
        } while (i >= 0);

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
                        LeerArchivo prueba=new LeerArchivo();
                        prueba.leer();
                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Cerrando sesión... ¡Regresa pronto!");
                        System.exit(0);
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

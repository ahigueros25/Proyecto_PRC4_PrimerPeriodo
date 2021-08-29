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
public class Catalogo {

    Scanner reader = new Scanner(System.in);
    private int[] codigo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String[] producto = {" huevos c/u $0.10", " pollo c/u $5.00", " aceite c/u $3.00", " fósforos c/u $0.50", " dulces c/u $ 0.80", " margarina c/u $0.30",
        " jabón c/u $ 2.25", " carne c/u $ 2.75", " gaseosa c/u $1.80", " desechables c/u $3.25"};
    int f = 0;
    String p;

    public Catalogo() {
    }

    public Catalogo(int[] codigo, String[] producto, double[] precio) {
        this.codigo = codigo;
        this.producto = producto;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public String[] getProducto() {
        return producto;
    }

    public void setProducto(String[] producto) {
        this.producto = producto;
    }
// para venta

    public void imprimir() {
        for (int f = 0; f < 9; f++) {
            System.out.println(codigo[f] + producto[f]);
        }

    }

// consulta de inventario
    public void imprimircodigo() {

        System.out.println("Ingrese valor de la componente:");
        f = reader.nextInt();
        System.out.print(codigo[f - 1] + producto[f - 1]);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.clases;

import java.io.*;

/**
 *
 * @author rjcha
 */
public class LeerArchivo {
    static String [] listainventario=new String[10]; //split
    static String rutaabsoluta = "\\archivos\\inventario.txt";

    public void leer(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            String path=System.getProperty("user.dir");
            // Apertura del fichero y creacion de BufferedReader para poder 
            // hacer una lectura comoda (disponer del metodo readLine()). 
            archivo = new File(path + rutaabsoluta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero 
            String linea;
            int i=0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                listainventario[i]=linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos 
            // que se cierra tanto si todo va bien como si salta  
            // una excepcion. 
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}

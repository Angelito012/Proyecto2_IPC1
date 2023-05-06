
package Listas;

import java.util.ArrayList;

public class Linkedlist {
    
    public static ArrayList<Datos> listaRegistro = new ArrayList();
    
    public static String addUsernuevo(String user){
        Datos agregar = new Datos(user,"General");
        listaRegistro.add(agregar);
    
        return "Usuario ya fue agregado";
    
    }
    public static String addCategoria(String user, String categoria){
        Datos agregar = new Datos(user,categoria);
        listaRegistro.add(agregar);
    
        return "Usuario ya fue agregado";
    
    }
    
}


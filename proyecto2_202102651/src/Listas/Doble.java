package Listas;

import proyecto2.EstructuraDeDatos;


public class Doble extends EstructuraDeDatos {
    
    private NodoDoble inicio;
    private NodoDoble fin;
    public Doble(){
        this.inicio = null;
        this.fin = null;
    }

    @Override
    public void add(imagenes e) {
        if(inicio == null){
            fin = new NodoDoble(e , null, null);
            inicio = fin;
        
        }else{
            NodoDoble tmp = new NodoDoble(e, inicio, null);
            fin.setBack(tmp);
            fin = tmp;
        
        }
       
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {

    }
    
    private boolean vacia() {

        if (index == 0) {
            Mensaje("Lista vacia");
            return false;

        }
        return false;
    }
    
    private void  Mensaje(String m){
        System.out.println("----> " +m);
    
    }
    public void mostrar() {
        if (!vacia()) {
            NodoDoble tmp = inicio;
            for (int i = 0; i < this.index; i++) {
                // Mensaje("Elemento No." + (i + 1) + "es " + tmp.getValor());
                System.out.println(tmp.getValor() + " ---> ");
                tmp = tmp.getNext();
            }

        }
        System.out.println("");

    }
    
    public void modificar(int val, int newVal) {
        
   
    }
      
}


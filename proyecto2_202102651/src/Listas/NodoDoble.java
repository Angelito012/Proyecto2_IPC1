
package Listas;


public class NodoDoble {

    private imagenes valor;
    private NodoDoble next;
    private NodoDoble back;

    public NodoDoble(imagenes valor, NodoDoble next, NodoDoble back) {
        this.valor = valor;
        this.next = next;
        this.back = back;
    }

    public imagenes getValor() {
        return valor;
    }

    public void setValor(imagenes valor) {
        this.valor = valor;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getBack() {
        return back;
    }

    public void setBack(NodoDoble back) {
        this.back = back;
    }

    

}


package Listas;


public class imagenes {
    
    String usuario;
    String categoria;
    String ruta;
    String nombre;

    public imagenes(String usuario, String categoria, String ruta, String nombre) {
        this.usuario = usuario;
        this.categoria = categoria;
        this.ruta = ruta;
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

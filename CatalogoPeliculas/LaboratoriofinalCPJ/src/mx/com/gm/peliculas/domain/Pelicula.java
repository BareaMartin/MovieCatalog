package mx.com.gm.peliculas.domain;

public class Pelicula {

    private String nombre;

    public Pelicula(){
        
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append(nombre);
        return sb.toString();
    }
    
    
}

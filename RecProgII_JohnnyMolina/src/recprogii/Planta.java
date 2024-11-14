
package recprogii;

import java.util.Objects;


public class Planta {
    protected String nombre;
    protected String ubicacion;
    protected String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima + '}';
    }

    public String getNombre() {
        return nombre;
    }
    public boolean puedeSerPodada(){
        return true;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Planta other = (Planta) obj;
        return nombre == other.nombre && Objects.equals(ubicacion, other.ubicacion);
    }
    
    public int hashCode() {
       return Objects.hash(nombre, ubicacion);
    }
    
    
    
}

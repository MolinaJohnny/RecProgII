
package recprogii;

public class Flor extends Planta {
    private Temporada temporada;

    public Flor(Temporada temporada, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return super.toString() + "Flor{" + "temporada=" + temporada + '}';
    }
    @Override
    public boolean puedeSerPodada(){
        return false;
    }

    
    
    
    
}

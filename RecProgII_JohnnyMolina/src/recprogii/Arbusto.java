
package recprogii;


public class Arbusto extends Planta implements Podable {
    private int follaje;

    public Arbusto(int follaje, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.follaje = follaje;
    }
    
    
        
    @Override
    public boolean puedeSerPodada(){
        return true;
    }
    public void podar(){
        System.out.println("Se esta podando el arbusto");
    }

    @Override
    public String toString() {
        return super.toString() + "Arbusto{" + "follaje=" + follaje + '}';
    }
    
}

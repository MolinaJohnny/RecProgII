
package recprogii;

public class Arbol extends Planta implements Podable {
    private double altura;

    public Arbol(double altura, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Arbol{" + "altura=" + altura + '}';
    }
    @Override
    public boolean puedeSerPodada(){
        return true;
    }
    public void podar(){
        System.out.println("Se esta podando el arbol");
    }
    
}

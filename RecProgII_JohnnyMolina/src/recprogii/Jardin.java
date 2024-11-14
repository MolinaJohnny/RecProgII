
package recprogii;

import java.util.HashSet;
import java.util.Set;


public class Jardin {
    private Set<Planta> plantas;
    
    public Jardin(){
        plantas = new HashSet<>();
    
    }
     
    public void agregarPlanta(Planta planta) throws PlantaRepetidaExcepcion{
        if(plantas.contains(planta)){
            throw new PlantaRepetidaExcepcion(" La planta con el nombre "+ planta.getNombre()+ " ya existe");
        }
        plantas.add(planta);
                
    }
    public void mostrarPlantas(){
        for (Planta p : plantas){
            System.out.println(p);}
    }
    public void podarPlantas(){
        for(Planta planta: plantas){
            if (planta.puedeSerPodada()){
                System.out.println("La planta "+ planta.getNombre()+ " se esta podando");
            }
            else 
                System.out.println("La planta "+ planta.getNombre()+ " no se puede podar");
        }
            }
        
        
        
}

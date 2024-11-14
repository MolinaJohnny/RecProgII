
package recprogii;


public class Main {


    public static void main(String[] args) {
  
    
      Jardin jardin = new Jardin();
      Planta plant1 = new Flor(Temporada.INVIERNO, "Rosa", "Primer piso", "Soleado");
      Planta plant2 = new Flor(Temporada.INVIERNO, "Rosa", "Primer piso", "Soleado");
      Planta plant3 = new Arbusto(15, "Generico", "Primer piso", "Soleado");
      Planta plant4 = new Arbol(5.0, "Abedul", "Primer piso", "Soleado");
      try{
            jardin.agregarPlanta(plant1);
            jardin.agregarPlanta(plant3);
            jardin.agregarPlanta(plant4);
            jardin.agregarPlanta(plant2);
            
        
        }catch (PlantaRepetidaExcepcion e){
                      System.out.println("Error!!! "+ e.getMessage());}
        System.out.println("-------------");
        jardin.mostrarPlantas();
        jardin.podarPlantas();
    }
    
}

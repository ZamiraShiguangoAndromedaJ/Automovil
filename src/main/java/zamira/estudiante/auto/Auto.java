
package zamira.estudiante.auto;

import zamira.estudiante.auto.clases.Automovil;
import zamira.estudiante.auto.enumeraciones1.TipoCombustible;
import zamira.estudiante.auto.enumeraciones2.TipoAutomovil;
import zamira.estudiante.auto.enumeraciones3.TipoColor;

/**
 *
 * @author user
 */
public class Auto {
     
    public int velocidad; 

  
    public Auto() {
        this.velocidad = 0;
    }

    public int acelerar(int incremento) {
        velocidad += incremento; 
        return velocidad;
    }

    public void desacelerar(int decrecimiento) {
        velocidad = Math.max(0, velocidad - decrecimiento); 
    }

    public void frenar() {
        velocidad = 0; 
    }

    public double tiempoLlegada(double distancia) {
        if (velocidad == 0) {
            return Double.POSITIVE_INFINITY; 
        }
        return distancia / velocidad; 
    }

    public int getvelocidadActual() {
        return velocidad;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("---------AUTOMOVIL------------");
        
        Automovil objAutomovil = new Automovil("Toyota", "Pick-ups", "V8", TipoCombustible.Biotenol, TipoAutomovil.Familiar, 4, 6, 225, TipoColor.Azul, 0);
        
        System.out.println("---------Atributos-----------");
        objAutomovil.mostrarAtributos();
=======
        Auto auto = new Auto(); 

        System.out.println("Velocidad inicial: " + auto.getvelocidadActual() + " km/h");


        auto.acelerar(120); 
        System.out.println("Velocidad tras acelerar: " + auto.getvelocidadActual() + " km/h");

        auto.desacelerar(20); 
        System.out.println("Velocidad tras desacelerar: " + auto.getvelocidadActual() + " km/h");

        auto.frenar(); 
        System.out.println("Velocidad tras frenar: " + auto.getvelocidadActual() + " km/h");
>>>>>>> b07b55db9582b814eeeee51e346c6f7857a5a1ea
    }
}



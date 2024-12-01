/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.auto.clases;

/**
 *
 * @author user
 */
public class Automovil {
        public int velocidad; 

  
    public Automovil() {
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
        Automovil auto = new Automovil(); 

        System.out.println("Velocidad inicial: " + auto.getvelocidadActual() + " km/h");


        auto.acelerar(120); 
        System.out.println("Velocidad tras acelerar: " + auto.getvelocidadActual() + " km/h");

        auto.desacelerar(20); 
        System.out.println("Velocidad tras desacelerar: " + auto.getvelocidadActual() + " km/h");

        auto.frenar(); 
        System.out.println("Velocidad tras frenar: " + auto.getvelocidadActual() + " km/h");
    }
    
}

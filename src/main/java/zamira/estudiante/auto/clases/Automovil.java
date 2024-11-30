/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.auto.clases;

import zamira.estudiante.auto.enumeraciones1.TipoCombustible;
import zamira.estudiante.auto.enumeraciones2.TipoAutomovil;
import zamira.estudiante.auto.enumeraciones3.TipoColor;

/**
 *
 * @author user
 */
public class Automovil {
    
    //Atributos
      public String marca;
      public String modelo;
      public String motor;
      public TipoCombustible tipoCombustible;
      public TipoAutomovil tipoAutomovil;
      public int numeroPuertas;
      public int cantidadAsiento;
      public double velodidadMaxima;
      public TipoColor color;
      public double velocidadActual;

    public Automovil() {
        
    }
      
    public Automovil(String marca, String modelo, String motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsiento, double velodidadMaxima, TipoColor color, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsiento = cantidadAsiento;
        this.velodidadMaxima = velodidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    
    //get y set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsiento() {
        return cantidadAsiento;
    }

    public void setCantidadAsiento(int cantidadAsiento) {
        this.cantidadAsiento = cantidadAsiento;
    }

    public double getVelodidadMaxima() {
        return velodidadMaxima;
    }

    public void setVelodidadMaxima(double velodidadMaxima) {
        this.velodidadMaxima = velodidadMaxima;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
      

    //mostrar Atributos
    
    public void mostrarAtributos(){
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Canridad de Asientos: " + cantidadAsiento);
        System.out.println("Velocidad Máxima: " + velodidadMaxima+ " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        
        
    }
    
    
    
      
}



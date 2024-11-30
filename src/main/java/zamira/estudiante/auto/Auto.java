/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

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

    public static void main(String[] args) {
        System.out.println("---------AUTOMOVIL------------");
        
        Automovil objAutomovil = new Automovil("Toyota", "Pick-ups", "V8", TipoCombustible.Biotenol, TipoAutomovil.Familiar, 4, 6, 225, TipoColor.Azul, 0);
        
        System.out.println("---------Atributos-----------");
        objAutomovil.mostrarAtributos();
    }
}

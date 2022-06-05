package POOURU;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class UsoCoche {

    public static void main(String[] args) {
       
        /* Coche miCoche = new Coche();
       
        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce Color"));
      
        System.out.println(miCoche.dimeColor());
       
        System.out.println(miCoche.DimeTadosGenerales());
       
        miCoche.cofiguraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
       
        System.out.println(miCoche.dimeAsientos());
       
        miCoche.cofiguraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
       
        System.out.println(miCoche.dimeClimatizador());
       
        System.out.println(miCoche.dimePesoCoche());
       
        System.out.println("El precio final es: " +miCoche.precioCoche());*/
       
       Camioneta miCamioneta = new Camioneta();
       
       System.out.println(miCamioneta.DimeCaracteristicasGenerales());
       
       miCamioneta.EstablecerColor(JOptionPane.showInputDialog("Introduzca el color"));
       
       System.out.println(miCamioneta.DimeColor());
       
       miCamioneta.EstablecerAsientos(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de asientos")));

       System.out.println(miCamioneta.DimeAsientos());
       
       miCamioneta.ConfigurarTraccionAutomatica(JOptionPane.showInputDialog("Tiene traccion automatica?"));
       
       System.out.println(miCamioneta.DimeTraccionAutomatica());
       
       miCamioneta.ConfigurarClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
       
       System.out.println(miCamioneta.DimeClimatizador());
       
       miCamioneta.ConfigurarTraccionRuedas(JOptionPane.showInputDialog("Tiene traccion en las 4 ruedas?"));

       System.out.println(miCamioneta.DimeTraccionRuedas());
       
       miCamioneta.ConfigurarAsientoCuero(JOptionPane.showInputDialog("Tiene asiento de cuero?"));
       
       System.out.println(miCamioneta.DimeAsientoCuero());
       
       System.out.println(miCamioneta.DimePesoCamioneta());
       
       System.out.println(miCamioneta.CalcularPrecioCamioneta());
       
    }

}

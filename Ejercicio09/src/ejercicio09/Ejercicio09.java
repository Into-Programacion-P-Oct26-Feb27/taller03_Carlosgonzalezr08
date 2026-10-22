/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Carlos
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double variable1 = (Math.sqrt(225));
        double variable2 = (Math.pow(5, 2));
        int variable3 = 50;
        int variable4 = 120;
        int variable5 = 4;
        int variable6 = 30;

        System.out.println("--------------Solucion al Problema---------------");

        boolean resultado = (!((variable1 + variable2 < variable3) && (variable4 / variable5 == variable6)));

        System.out.println(resultado);
    }
    
}

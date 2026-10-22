/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Carlos
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double variable1 = Math.pow(4, 3);
        double variable2 = Math.sqrt(81);
        int variable3 = 70;
        int variable4 = 50;
        int variable5 = 2;
        int variable6 = 25;
        int variable7 = 18;
        int variable8 = 12;
        int variable9 = 25;
        double variable10 = Math.pow(7, 2);
        int variable11 = 40;
        
        System.out.println("--------------Solucion al Problema---------------");

        boolean resultado = ((variable1 + variable2 > variable3) && (variable4 / variable5 == variable6)) || ((variable7 + variable8 <= variable9) && !(variable10 > variable11));
        
        System.out.println(resultado);
    }
    
}

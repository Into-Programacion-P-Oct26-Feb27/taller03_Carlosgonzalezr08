/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Carlos
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int variable1 = 15;
        int variable2 = 25;
        int variable3 = 30;
        double variable4 = (Math.pow(8, 2));
        int variable5 = 60;
        double variable6 = Math.sqrt(144);
        int variable7 = 12;

        System.out.println("--------------Solucion al Problema---------------");

        boolean resultado = (variable1 + variable2 > variable3) || (variable4 < variable5) && (variable6 == variable7);

        System.out.println(resultado);

    }

}

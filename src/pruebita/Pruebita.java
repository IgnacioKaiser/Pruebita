/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebita;

import java.util.Scanner;

/**
 *
 * @author kaise
 */
public class Pruebita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su género ('M', 'H' u 'O'");
        String gen = leer.nextLine();
        switch (gen) {
            case "M":
            case "m":
                System.out.println(nombre+", es usted una ídola");
                break;
            case "h":
            case "H":
                System.out.println(nombre+", es usted un ídolo");
                break;
            default:
                System.out.println(nombre+", es usted une ídole");
                break;
        }
    }
    
}

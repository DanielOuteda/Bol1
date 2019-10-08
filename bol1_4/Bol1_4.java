/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_4;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce primer numero =");
        float primernumero = sc.nextFloat();
        System.out.println("Introduce segundo numero =");
        float segundonumero = sc.nextFloat();
        System.out.println("Suma = "+ (primernumero+segundonumero));
        System.out.println("Resta = "+ (primernumero-segundonumero));
        System.out.println("Multiplicación = "+ (primernumero*segundonumero));
        System.out.println("División = "+ (primernumero/segundonumero));
    }
    
}

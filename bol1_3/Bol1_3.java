/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_3;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce euros =");
        float euros = sc.nextFloat();
        System.out.println("Dolares = "+ (euros*1.10));
    }
    
}

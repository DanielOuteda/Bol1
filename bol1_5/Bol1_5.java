/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_5;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce millas marinas =");
        float millasMarinas = sc.nextFloat();
        System.out.println("Metros = "+ (millasMarinas*1852));
    }
    
}

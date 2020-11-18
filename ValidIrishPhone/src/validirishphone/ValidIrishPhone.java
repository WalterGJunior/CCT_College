/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validirishphone;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ValidIrishPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
//        int[] phone;
//        phone = new int[10];
//        
//        Scanner myKB = new Scanner(System.in);
//        
//        System.out.println("Please enter with a Valid Irih Phone Number");
//        phone = myKB.nextLine();

Scanner input = new Scanner(System.in);
    double[] numbers = new double[5];

    for (int i = 0; i < numbers.length; i++)
    {
        System.out.println("Please enter number");
        numbers[i] = input.nextDouble();
    }
        
        
        
        
    }    
    
}

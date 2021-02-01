/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        Scanner input = new Scanner(System.in);
        double factorial = 1;
        double n;

        System.out.println("The factorial that you want know is");
        n= input.nextInt();
        
        if( n <= 15){
        for (double j=1; j <= n ; j++){
        factorial = factorial* j;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
        }
        else {
        System.out.println(" There is not this factorial");
        }
    }
    
}
    

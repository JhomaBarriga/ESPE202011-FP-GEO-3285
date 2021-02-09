/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.fuctions;

import java.util.Scanner;

/**
 *
 * @KAREN BARRIGA CARVAJAL
 */
public class HW10FUCTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);      
        int divd;
        int divr;
        float quotient =0;
        int argument;
        int result;
        int ensue;
        int multiplicand;
        int stop = 12;
        int product;
     


        System.out.println(" ♦♦♦♦♦ Enter a divd ♦♦♦♦♦");
         divd = input.nextInt();
        System.out.println(" ♦♦♦♦♦ Enter a divr ♦♦♦♦♦");
        divr = input.nextInt();
       
        quotient = divideTwoNumbers(divd,divr);
        System.out.println("  Quotient of divd and divr is  ➟ " + quotient);
           System.out.println();  
              
        System.out.println(" ♦♦♦♦♦ Enter a number for the square fuction  ♦♦♦♦♦");
        argument=input.nextInt();
        result = computerSquare(argument);
        System.out.println(" The square of  ➟  " + argument + " is equal to" + result ); 
          System.out.println();

        
        System.out.println(" ♦♦♦♦♦♦ Enter x for the fuction of parabola ♦♦♦♦♦♦");
        argument=input.nextInt();
        ensue = computerParabola(argument);
        System.out.println(" The result of the function  ➟  " + argument + " is equal to  ➟ " + ensue );
          System.out.println();

        
        System.out.println("♦♦♦♦♦♦ Enter a number for that You want to study your table ♦♦♦♦♦♦ ");
        multiplicand = input.nextInt();
        
          for( int multiplier = 1; multiplier <= stop ; multiplier++) {
        product = showTheMultiplicationTables(multiplicand,multiplier);
        System.out.println(multiplicand + " x" + multiplier + " =" + product);
        }
        
        int n =  5 ;
        int fact =  0 ;
        fact = factorial (n);
        System.out.println( " factorial de "  + n +  " es igual a -> "  + fact);

        

    }

    public static float divideTwoNumbers (int dividend, int divisor){
  
       float quotient=0.0F;
      
       quotient = (float)dividend / (float)divisor;
    
       return quotient;
        
    }
    
    public static int computerSquare(int argument){
        int result = 0;
        
        result = argument *argument;
        
        return result;
    }
    
    public static int computerParabola(int argument){
        int ensue=0;
        ensue= argument*argument+2*argument+1;
        
        return ensue;
    }
    
    public static int showTheMultiplicationTables(int multiplicand , int multiplier){
        
        int product;
        
        product = multiplicand * multiplier;
                
        product = multiplicand * multiplier;

        return product;
    }
    public  static  int  factorial ( int  n ) {
        if (n <  0 ) {
            return  - 1 ;
        } else {
            if (n ==  0 ) {
                return  1 ;
            } else {
                return (n * factorial (n -  1 ));
            }
        }
    }
}
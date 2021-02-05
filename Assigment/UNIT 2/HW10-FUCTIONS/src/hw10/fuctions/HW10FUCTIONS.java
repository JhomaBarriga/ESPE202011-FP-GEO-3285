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
        int x ;
        int y ;
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
              
        System.out.println(" ♦♦♦♦♦ Enter a number for x for the square fuction  ♦♦♦♦♦");
        x=input.nextInt();
        y=f(x);
        System.out.println(" The square of  ➟  " + x + " is equal to" + y ); 
          System.out.println();

        
        System.out.println(" ♦♦♦♦♦♦ Enter x for the g(x) fuction ♦♦♦♦♦♦");
        x=input.nextInt();
        y=g(x);
        System.out.println(" The result of the function  ➟  " + x + " is equal to  ➟ " + y );
          System.out.println();

        
        System.out.println("♦♦♦♦♦♦ Enter a number for that You want to study your table ♦♦♦♦♦♦ ");
        multiplicand = input.nextInt();
        
          for( int multiplier = 1; multiplier <= stop ; multiplier++) {
        product = Multiplynumbers(multiplicand,multiplier);
        System.out.println(multiplicand + " x" + multiplier + " =" + product);
        }

    }

    public static float divideTwoNumbers (int dividend, int divisor){
  
       float quotient=0.0F;
      
       quotient = (float)dividend / (float)divisor;
    
       return quotient;
        
    }
    
    public static int f(int x){
        int y = 0;
        
        y=x*x;
        
        return y;
    }
    
    public static int g(int x){
        int y=0;
        y=x*x+2*x+1;
        
        return y;
    }
    
    public static int Multiplynumbers(int multiplicand , int multiplier){
        
        int product;
        
        product = multiplicand * multiplier;
        
        return product;
    }
}
   
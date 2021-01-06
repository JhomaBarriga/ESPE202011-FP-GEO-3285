/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Sony Vaio
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        int sum;
        int addendl;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int factor;
        int factor2;
        int product;
        
        int dividen;
        int divider;
        int quotient;
        int residue;
        
        int module;
        
        //initilization
        addendl = 5; 
        addend2 = 18;
        
        minuend = -23;
        subtrahend = -6;
        
        factor = 8;
        factor2 = 6;
        
        dividen = 56;
        divider = 7;
                
        //operation
        sum = addendl + addend2;
        
        difference = minuend - subtrahend;
        
        product = factor * factor2;
        
        quotient = dividen / divider;
        
        module = dividen % divider;
        
        
        System.out.println ("The addition of " + addendl + " + " + addend2 + " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum es equal to --> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum " + (++sum));
        
        System.out.println("The subtraction of " + minuend + " - " + subtrahend + " is equal to " + (minuend - subtrahend));
        
        System.out.println("The multiplication of " + factor + " * " + factor2 + " is equal to --> " + product );
        
        System.out.println("The division of " + dividen + " / " + divider + " is equal to --> " + quotient );
        
        System.out.println("The module of " + dividen + " % " + divider + " is equal to " + ( dividen % divider));
        
       
       
      
                
    }
    
}
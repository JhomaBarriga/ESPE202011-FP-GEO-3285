/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03.iterations;

/**
 *
 * @author Sony Vaio
 */
public class HW03ITERATIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i;
        i=0;
        System.out.println("==== This is a while loop from 1 to 7 ====");
        while (i<7){
            System.out.println("i -> " + (i+1));
            //i += 1;
            i++;
            //i = i + 1;
    }
        System.out.println("Multiplication Tables  : 7"); 
        int top=12;
        int product=0;
        int table =7;
        for(int j =1; j<=top; j++ ){
           product = table * j;
           System.out.println("7 * " + j + "=" + product);
        }
        System.out.println(" Subtracion  : 7"); 
        int base = 7;
        int difference= 0;
  
        for(int j=1; j<=base; j++ ){
           difference = base - j;
           System.out.println("7 - " + j + "=" + difference);
        }
        
    }
}
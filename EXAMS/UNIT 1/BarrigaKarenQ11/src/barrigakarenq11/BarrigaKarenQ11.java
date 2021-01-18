/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barrigakarenq11;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class BarrigaKarenQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        boolean mainloop = true; 
        int option;
     
        
        do{
            System.out.println("===============Calculator=========");
            System.out.println("0. -> Exit");
            System.out.println("1. -> Tables of multiplication");
            
            System.out.println("Enter your menu option ->");
            option = input.nextInt();
            
            switch(option){
                case 0:
                    System.out.println("Good bye friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println( "Invalid option");
                    break;
                case 1:
                        int top = 12;
                        int product=0;
                        
                        System.out.println("enter the table of multiplication");
                        int table = input.nextInt();
                        int j;
                        for (j=1 ; j<=top ; j++){
                        product = table * j;
                        
                        System.out.println(table + " * " + j + " = " + product);
                        }
                        break;
        }
    
    }while(option != 3);
        
    }
}
      

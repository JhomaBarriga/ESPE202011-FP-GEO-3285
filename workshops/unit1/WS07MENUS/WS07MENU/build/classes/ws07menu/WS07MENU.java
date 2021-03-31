/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menu;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class WS07MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        boolean mainloop = true;
        int option;
        
        do{
            System.out.println("===============Calculator=========");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");
            
            System.out.println("Enter your menu option ->");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend1 ->");
                    addend1 = input.nextInt();
                    System.out.println("enter addend2 ->");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println("The sum is -->" + sum);
                    break;
                case 2:
                    int minuend;
                    int subtrahend;
                    int difference;
                    System.out.println("enter minuend ->");
                    minuend = input.nextInt();
                    System.out.println("enter subtrahend ->");
                    subtrahend = input.nextInt();
                    difference = minuend - subtrahend;
                    System.out.println("The subtraction is -->" + difference);
                    break;
                case 3:
                    int factor1;
                    int factor2;
                    int product;
                    System.out.println("enter factor1 ->");
                    factor1 = input.nextInt();
                    System.out.println("enter factor2 ->");
                    factor2 = input.nextInt();
                    product = factor1 * factor2;
                    System.out.println("The multiplication is -->" + product);
                    break;
                case 4:
                    int dividen;
                    int divider;
                    int quotient;
                    System.out.println("enter dividen ->");
                    dividen = input.nextInt();
                    System.out.println("enter divider ->");
                    divider = input.nextInt();
                    quotient = dividen / divider;
                    System.out.println("The division is -->" + quotient);
                    break;
                case 5: 
                    System.out.println(" Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;            
            } 
           
        }while (option != 5);
    }
}
      
        
   


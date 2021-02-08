/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11fuctions.and.recursions;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class WS11FUCTIONSANDRECURSIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int operand1;
        int operand2;
        int sum;
        int product1;
        int top =12;
        int product2;
        int product3;
        int module;
        float quotient;
        int multiplier1 = 1;
        int multiplier2 = 1;
        int data;
     
                
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("=============== Enter operand1 ============");
            operand1 = input.nextInt();
            System.out.println("=============== Enter operand2 ============");
            operand2 = input.nextInt();
            if (operand1 == 0 || operand2 == 0) {
                System.out.println("ERROR 404");
            } else if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                showMultiplication(operand1, operand2);
            } else if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                showAdition(operand1, operand2);
            } else if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                showModulus(operand1, operand2);
            } else if (operand1 % 11 == 0 && operand2 % 11 == 0) {
                showMultiplicationTable(operand1, operand2);

            } else if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                showDivision(operand1, operand2);
            } else {
                System.out.println("======= INVALID 3312 ======");
            }
            int n =  5 ;
            int fact =  0 ;
            fact = factorial (n);
            System.out.println( " factorial de "  + n +  " es igual a -> "  + fact);
            
            System.out.println("Do you want to continue: YES(1), NO (0)");
            data = input.nextInt();
            if (data == 0) {
                System.exit(0);
            }
        } while (operand1 != 1 || operand2 != 1);
    }

    private static void showDivision(int operand1, int operand2) {
        float quotient;
        quotient = (float) operand1 / operand2;
        System.out.println("The quotient " + operand1 + " / " + operand2
                + " is equal to --> " + quotient);
    }

    private static void showModulus(int operand1, int operand2) {
        int module;
        module = operand1 % operand2;
        System.out.println("The module " + operand1 + " % " + operand2
                + " is equal to --> " + module);
    }

    private static void showAdition(int operand1, int operand2) {
        int sum;
        sum = operand1 + operand2;
        System.out.println("The sum " + operand1 + " + " + operand2
                + " is equal to --> " + sum);
    }

    private static void showMultiplication(int operand1, int operand2) {
        int product1;
        product1 = operand1 * operand2;
        System.out.println("The product " + operand1 + " * " + operand2
                + " is equal to --> " + product1);
    }

    public static void showMultiplicationTable(int operand1, int operand2) {
        int product2;
        int stop = 12;

        System.out.println("The multiplication table of: " + operand1 );
        for (int multiplier1 = 1; multiplier1 <= stop; multiplier1++) {
            product2 = operand1 * multiplier1;
            System.out.println( operand1 + " * " + multiplier1 + " = " + product2);
        }
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
  

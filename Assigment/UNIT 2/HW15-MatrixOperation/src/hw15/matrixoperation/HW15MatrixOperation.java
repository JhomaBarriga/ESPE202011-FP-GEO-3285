/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 


        Scanner scanner = new Scanner(System.in);
        
        int m;
        int n;
        int a[][]= scanner.nextInt();
        int b[][];

        System.out.println(" Please enter de dimension m -> ");
        m = scanner.nextInt();
        System.out.println(" Please enter de dimension n -> ");
        n = scanner.nextInt();
        
        int matrix [][] = new int[m][n];
        a[][]=
        
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The additon of matrix A -> ");
        
        for(int i = 0 ; i < m ; i++){
            System.out.println("");
            for (int j = 0 ; j < n ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
        
        System.out.println("\nAnd Matrix B -> ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

        System.out.println("\nequals to -> ");
                for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

        
    }

}
   
        
        
        


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

        int m ;
        int n;
        int matrixA[][];
        int matrixB[][];
        int sumMatrix[][];
       

        //The dimension of a matrix is mxn 
        System.out.println("Enter dimensions of matrix");
        System.out.println("Enter de dimension m of matrix ");
        m = scanner.nextInt();
        System.out.println("Enter de dimension n of matrix");
        n = scanner.nextInt();
        
        
        System.out.println(" Enter of number of matrix A");
        matrixA = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

      
        System.out.println(" Enter of number of matrix B");
        matrixB = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        sumMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("The sum of this matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        
    }

}
   
        
        
        


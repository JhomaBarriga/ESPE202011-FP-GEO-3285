/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfuction;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW16MatrixFuction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int m;
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
        matrixA = readMatrixElements(m, n, scanner);

        System.out.println("");

        System.out.println(" Enter of number of matrix B");
        matrixB = readMatrixElements2(m, n, scanner);

        System.out.println("");

        sumMatrix = calculateSumMatrix(m, n, matrixA, matrixB);
        prettyPrintSumMatrix(m, n, sumMatrix);

    }

    private static void prettyPrintSumMatrix(int m, int n, int[][] sumMatrix) {
        System.out.println("The sum of A + B matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] calculateSumMatrix(int m, int n, int[][] matrixA, int[][] matrixB) {
        int[][] sumMatrix;
        sumMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }

    private static int[][] readMatrixElements2(int m, int n, Scanner scanner) {
        int[][] matrixB;
        matrixB = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" B[" + (i + 1) + "]{" + (j + 1) + "] = ");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        return matrixB;
    }

    private static int[][] readMatrixElements(int m, int n, Scanner scanner) {
        int[][] matrixA;
        matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" A[" + (i + 1) + "]{" + (j + 1) + "] = ");
                matrixA[i][j] = scanner.nextInt();
            }
        }
        return matrixA;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibraries;

import ec.edu.espe.Matrix.OperatinMatrix;
import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] c;
        int[][] a;
        int[][] b;
        int[][] t;
        int m = 0;
        int n = 0;
        int addition;
        int substraction;
        int transpose;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix dimensions");
        System.out.println(" m --> ");
        m = input.nextInt();
        System.out.println("n --> ");
        n = input.nextInt();

        a = new int[m][n];
        b = new int[m][n];
        c = new int[m][n];
        t = new int[n][m];

        System.out.println("---Enter elements of Matrix A ---");
        showTheDimensionOfMatrix(m, n, a, input);
        System.out.println("---Enter elements of matrix B ---");
        showTheDimensionOfMatrix(m, n, b, input);

        addition = OperatinMatrix.calculateAdditonMatrix(m, n, c, a, b);
        System.out.println("The additon  A -> ");
        printMatrix(m, n, a);
        System.out.println("\n with B -> ");
        printMatrix(m, n, b);
        System.out.println("\n result is -> ");
        printMatrix(m, n, c);
        System.out.println("");

        substraction = OperatinMatrix.calculateSubstractionMatrix(m, n, c, a, b);
        System.out.println("The subtraction of A -> ");
        printMatrix(m, n, a);
        System.out.println("\n B -> ");
        printMatrix(m, n, b);
        System.out.println("\n is -> ");
        printMatrix(m, n, c);
        System.out.println("");

        transpose = OperatinMatrix.calculateTheTranspose(n, m, t, a);
        System.out.println("The transpose  -> ");
        printMatrix(n, m, a);
        System.out.println("\n is  -> ");
        printMatrix(n, m, t);

    }

    public static void printMatrix(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + matrix[i][j]);
            }
        }
    }

    public static void showTheDimensionOfMatrix(int m, int n, int[][] matrix, Scanner input) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println( "Element" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                matrix[i][j] = input.nextInt();
            }

        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Matrix;

/**
 *
 * @author Sony Vaio
 */
public class OperatinMatrix {

    public static int calculateAdditonMatrix(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return 0;
    }

    public static int calculateSubstractionMatrix(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return 0;
    }

    public static int calculateTheTranspose(int n, int m, int[][] t, int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = a[j][i];

            }
        }
        return 0;
    }

}

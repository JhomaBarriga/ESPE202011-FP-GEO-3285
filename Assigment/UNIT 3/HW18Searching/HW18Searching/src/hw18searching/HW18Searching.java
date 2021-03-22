/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(" BARRIGA CARVAJAL KAREN JHOMARA ");
        Scanner input = new Scanner(System.in);
        int arr[] = {0, 3, 5, 6, 7, 8, 10, 14, 22, 25, 30, 35};
        int n = arr.length;
        int x;
        int result;

        System.out.println(" === Enter element , please ===");
        x = input.nextInt();
        result = Binary.getBinary(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println(" There is not this element");
        } else {
            System.out.println("Element found at index " + result);
        }
        System.out.println("==== Enter element , please ===");
        x = input.nextInt();
        result = Linear.searchLinear(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

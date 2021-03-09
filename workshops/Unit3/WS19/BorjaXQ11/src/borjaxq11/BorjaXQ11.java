/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borjaxq11;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class BorjaXQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        System.out.println("1.- Enter the integers");
        System.out.println("The sum is: " + sumArray(in));

        System.out.println("2.- Enter the numbers to obtain the average");
        System.out.println("The average is: " + meanNumer(in));

        System.out.println("Enter the number to search for: ");
        if (findNumber(in)) {
            System.out.println("The YES number is in the list");
        } else {
            System.out.println("The number is NOT listed");
        }

    }

    private static int sumArray(Scanner in) {
        int[] arrayNumbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arrayNumbers[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum += arrayNumbers[i];
        }

        return sum;

    }

    private static float meanNumer(Scanner in) {
        float[] arrayNumbers = new float[3];
        float mean = 0;
        for (int i = 0; i < 3; i++) {
            arrayNumbers[i] = in.nextFloat();
        }

        for (int i = 0; i < 3; i++) {
            mean += arrayNumbers[i];
        }

        return mean / 3;

    }

    private static boolean findNumber(Scanner in) {

        int[] arrayNumbers = {12, 23, 34, 98, 87, 65, 0};
        float mean = 0;
        int numberFind = in.nextInt();

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == numberFind) {
                return true;
            }
        }

        return false;
    }

}



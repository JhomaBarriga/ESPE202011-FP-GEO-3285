/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.fruitssimulator;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW14FRUITSSIMULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", " Mango", "Watermelon", "Pineapple"};

        for (String fruit : fruits) {
            System.out.println("Fruit name -> " + fruit);
        }

        int[] vegetablesBasquet;
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number  of vegetables basquet -> ");
        n = input.nextInt();
        vegetablesBasquet = new int[n];

        //vegetablesBasquet[0] 
        //vegetablesBasquet[4] , etc 
        for (int i = 0; i < n; i++) {s
            System.out.print("Enter the number of vegetables that there are in the basquet " + (i + 1) + " -> ");
            vegetablesBasquet[i] = input.nextInt();
        }

        for (int basquet : vegetablesBasquet) {
            System.out.println(" There are " + basquet + " vegetables in the basquet ");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("The vegetables of the basquet " + (i + 1) + " are  -> " + vegetablesBasquet[i]);
        }

        float[] costVegetablesBasquet = {2.5F, 2.35F, 3.2F, 4.20F, 4.3F, 5.2F};

        for (int i = 0; i < costVegetablesBasquet.length; i++) {
            System.out.println(" The cost of vegetables basquet is  " + (i + 1) + " -> " + costVegetablesBasquet[i]);
        }

    }
}

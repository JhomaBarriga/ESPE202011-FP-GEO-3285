/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hs14.arrays;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HS14ARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] fruitsBasquet;
        String[] fruits = {"Banana", "Apple"," Mango", "Watermelon","Pineapple"};
        float[] weightsByCoop = { 1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of fruit basquet -> ");
        n = input.nextInt();

        fruitsBasquet = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];

//        fruitsBasquet[0] 
//        fruitsBasquet[1] 
//        fruitsBasquet[2] 
//        fruitsBasquet[3] 
//        fruitsBasquet[4] 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of fruits of basquet " + (i + 1) + " -> ");
            fruitsBasquet[i] = input.nextInt();
        }

        for (int  basquet : fruitsBasquet) {
            System.out.println(" The are " + basquet + " fruits in the basquet ");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("The fruist of the basquet " + (i + 1) + " -> " + fruitsBasquet[i]);
        }

        for (String fruit : fruits) {
            System.out.println("Fruits name -> " + fruit);
        }
        
        for (int i = 0; i < weightsByCoop.length ; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + weightsByCoop[i]);
        }

    }

}
   

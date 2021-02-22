/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.pkg22.february;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class QUIZZ22FEBRUARY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] hardwareStoreProducts;
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number  of harware store products -> ");
        n = input.nextInt();
        hardwareStoreProducts = new int[n];
        
        

        String[] hardwareProducts = {"Nail", "Drill", " Spatula", " Hammer", "Tools"};

        for (String harwareProduct : hardwareProducts) {
            System.out.println("The name of hardware store products is -> " + harwareProduct);
        }

        float[] products = new float[5];

        products [0] = 1.5F;
        products[1] = 2.33F;
        products [2] = 1.44f;
        products [3] = 2.4F;
        products [4]= 3.23F;

        for (float i = 0; i < 5; i++) {
            System.out.println("THE PRICE OF HARDWARE STORE PRODUCTS ARE ");

            System.out.println("The price of Nail is "  + products[0]);
            System.out.println("The price of Drill is " + products[1]);
            System.out.println("The price of Spatula is " + products[2]);
            System.out.println("The price of Hammer is " + products[3]);
            System.out.println("The price of tools is " + products[4]);

        }
        
    }    
}       
      

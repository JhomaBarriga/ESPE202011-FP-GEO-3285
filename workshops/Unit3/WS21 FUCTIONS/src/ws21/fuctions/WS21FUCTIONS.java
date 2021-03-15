/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.fuctions;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class WS21FUCTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" AUTHOR : BARRIGA CARVAJAL KAREN JHOMARA");
        
        Scanner input = new Scanner(System.in);
        
        //printer A4TONER
        
        float velocitypages = 800 ;
        float time;
        float pages;
        
        //take into account that this printer prints up to 800 pages in 60 seconds
        
        System.out.println("Enter the time  in seconds , please");
        time = input.nextFloat();
       pages = calculateNumberOfPages(velocitypages, time);
        System.out.println(" the printer print " + pages + " in " + time + " seconds ");
        System.out.println();
        
        System.out.println("Enter the number of pages , please");
        pages = input.nextFloat();
       time = calculateTheTime(pages, velocitypages);
        System.out.println(" In " + time + " seconds " +  " this printer prints " + pages + "pages");
        
    }

    private static float calculateTheTime(float pages, float velocitypages) {
        float time;
        time = (pages * 60)/ velocitypages;
        return time;
    }

    private static float calculateNumberOfPages(float velocitypages, float time) {
        float pages;
        pages = (velocitypages * time)/60;
        return pages;
    }
    
}

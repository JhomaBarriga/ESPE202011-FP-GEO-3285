/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        boolean mainloop = true;
        int option;
        
        do{
            System.out.println("===============Calculator=========");
            System.out.println("1. -> Area of a square");
            System.out.println("2. -> Area of a rectangle");
            System.out.println("3. -> Area of a Diamond");
            System.out.println("4. -> Area of a Triangle");
            System.out.println("5. -> Exit");
            
            System.out.println("Enter your menu option ->");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    int side;
                    int Areasquare;
                 
                    System.out.println("enter side ->");
                    side = input.nextInt();
                    Areasquare = side * side;
                    System.out.println("The Area of square is -->" + Areasquare);
                    break;
                case 2:
                    int base;
                    int height;
                    int Arearectangle;
                    System.out.println("enter base ->");
                    base = input.nextInt();
                    System.out.println("enter height ->");
                    height = input.nextInt();
                    Arearectangle = base * height;
                    System.out.println("The area of a rectangle is -->" + Arearectangle);
                    break;
                case 3:
                    int Majordiagonal;
                    int Minordiagonal;
                    int Areadiamond;
                    System.out.println("enter majordiagonal ->");
                    Majordiagonal = input.nextInt();
                    System.out.println("enter minordiagonal ->");
                    Minordiagonal = input.nextInt();
                    Areadiamond = (Majordiagonal * Minordiagonal) / 2;
                    System.out.println("The area of a diamond is -->" + Areadiamond);
                    break;
                case 4:
                    int based;
                    int heightri;
                    int Areatriangle;
                    System.out.println("enter based ->");
                    based = input.nextInt();
                    System.out.println("enter heightri ->");
                    heightri = input.nextInt();
                    Areatriangle = ( based * heightri) / 2;
                    System.out.println("The are of triangle is -->" + Areatriangle);
                    break;
                case 5: 
                    System.out.println(" Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;            
            } 
           
        }while (option != 5);
    }
}
        
   
   
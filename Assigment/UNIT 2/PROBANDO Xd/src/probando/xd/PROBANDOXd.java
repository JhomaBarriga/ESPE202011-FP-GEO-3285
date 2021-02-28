/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando.xd;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class PROBANDOXd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner coordinate = new Scanner(System.in);

        float x;
        float y;
        float module;
        float angle;
        float pi = 3.14F;

        System.out.print("Enter your cartesian coordinate X->");
        x = coordinate.nextInt();
        System.out.print("Enter your cartesian coordinate Y-> ");
        y = coordinate.nextInt();

        System.out.println("Your coordiante is " + "(" + x + "i , " + y + "j" + ")");
        System.out.println();

       
        System.out.println("In this moment we are converting your coordinate to polar coordinate ");
        System.out.println();

        float X;
        X = (float) Math.pow(x, 2);
        float Y;
        Y = (float) Math.pow(y, 2);

        module = (float) Math.sqrt(X + Y);
        System.out.println(" The module of your polar coordinate is --> " + module);
        angle = (float) Math.atan(y / x) * (180 / pi);
        System.out.println(" The angle of your polar coordinate is --> " + angle);
        System.out.println();

        System.out.println("Your polar coordinate " + "(" + module + " , " + angle + ")");

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class WS13TASK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("=============== AREAS of Geometric Figures=========");
        System.out.println("1. -> Area of a Diamond");
        System.out.println("2. -> Area of a Triangle");
        System.out.println("3. -> Area of a Circule");
        System.out.println("====CPHYSICS CALCULATES====");
        System.out.println("4. -> Speed");
        System.out.println("5. -> Distance");
        System.out.println("6. -> Aceleration");
        System.out.println("7. -> Exit");

        System.out.println("Enter the option of the calculate that you want to do ->");
        option = input.nextInt();

        if (option == 1) {
            double Majordiagonal;
            double Minordiagonal;
            double Areadiamond;
            CalculateAreaDiamond(input);
        }
        if (option == 2) {
            double based;
            double heightri;
            double Areatriangle;
            CalculateAreaTriangle(input);
        }
        if (option == 3) {
            double radio;
            double pi = 3.141516;
            double Areacircle;

            CalculateAreaCircle(input, pi);
        }
        if (option == 4) {
            double Speed;
            double distance;
            double time;

            CalculateSpeed(input);
        }
        if (option == 5) {
            double Distance;
            double speed;
            double Time;

            CalculateDistance(input);
        }
        if (option == 6) {
            double Aceleration;
            double initialvelocity;
            double finalvelocity;
            double Time2;

            CalculateAcelearation(input);
        }
        if (option == 7) {

            System.out.println(" Good Bye");
            System.exit(0);

        }

    }

    private static void CalculateAcelearation(Scanner input) {
        double initialvelocity;
        double finalvelocity;
        double Time2;
        double Aceleration;
        System.out.println("Enter the initial speed in m/s ");
        initialvelocity = input.nextDouble();
        System.out.println("Enter the final speed in m/s");
        finalvelocity = input.nextDouble();
        System.out.println("Enter the time in seconds");
        Time2 = input.nextDouble();
        Aceleration = (finalvelocity - initialvelocity) / Time2;
        System.out.println("The Distance is --> " + Aceleration + " m/s^2 ");
        return;
    }

    private static void CalculateDistance(Scanner input) {
        double speed;
        double Time;
        double Distance;
        System.out.println("Enter the speed in m/s ");
        speed = input.nextDouble();
        System.out.println("Enter the tima in seconds");
        Time = input.nextDouble();
        Distance = speed * Time;
        System.out.println("The Distance is --> " + Distance + " meter");
        return;
    }

    private static void CalculateSpeed(Scanner input) {
        double distance;
        double time;
        double Speed;
        System.out.println("Enter the disance in meters");
        distance = input.nextDouble();
        System.out.println("Enter the tima in seconds");
        time = input.nextDouble();
        Speed = distance / time;
        System.out.println("The speed is --> " + Speed + " m/s");
        return;
    }

    private static void CalculateAreaCircle(Scanner input, double pi) {
        double radio;
        double Areacircle;
        System.out.println("Enter the radio");
        radio = input.nextDouble();
        Areacircle = radio * Math.sqrt(pi);
        System.out.println("The are of the circle is --> " + Areacircle);
        return;
    }

    private static void CalculateAreaTriangle(Scanner input) {
        double based;
        double heightri;
        double Areatriangle;
        System.out.println("enter based ->");
        based = input.nextDouble();
        System.out.println("enter heightri ->");
        heightri = input.nextDouble();
        Areatriangle = (based * heightri) / 2;
        System.out.println("The are of triangle is -->" + Areatriangle);
        return;
    }

    private static void CalculateAreaDiamond(Scanner input) {
        double Majordiagonal;
        double Minordiagonal;
        double Areadiamond;
        System.out.println("enter majordiagonal ->");
        Majordiagonal = input.nextDouble();
        System.out.println("enter minordiagonal ->");
        Minordiagonal = input.nextDouble();
        Areadiamond = (Majordiagonal * Minordiagonal) / 2;
        System.out.println("The area of a diamond is -->" + Areadiamond);
        return;
    }
}

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
        ShowMenuAreas();
        System.out.println("====PHYSICS CALCULATES====");
        ShowMenuPhysicscalformulas();

        System.out.println("Enter the option of the calculate that you want to do ->");
        option = input.nextInt();

        if (option == 1) {
            double Majordiagonal;
            double Minordiagonal;
            double Areadiamond;

            System.out.println("enter majordiagonal ->");
            Majordiagonal = input.nextDouble();
            System.out.println("enter minordiagonal ->");
            Minordiagonal = input.nextDouble();
            Areadiamond = CalculateAreaDiamond(Majordiagonal, Minordiagonal);
            System.out.println("The area of a diamond is -->" + Areadiamond);
        }
        if (option == 2) {
            double based;
            double heightri;
            double Areatriangle;
            System.out.println("enter based ->");
            based = input.nextDouble();
            System.out.println("enter heightri ->");
            heightri = input.nextDouble();
            Areatriangle = CalculateAreaTriangle(based, heightri);
            System.out.println("The are of triangle is -->" + Areatriangle);
        }
        if (option == 3) {
            double radio;
            double pi = 3.141516;
            double Areacircle;
            System.out.println("Enter the radio");
            radio = input.nextDouble();
            Areacircle = CalculateAreaCircle(radio, pi);
            System.out.println("The are of the circle is --> " + Areacircle);

        }
        if (option == 4) {
            double Speed;
            double distance;
            double time;
            System.out.println("Enter the disance in meters");
            distance = input.nextDouble();
            System.out.println("Enter the tima in seconds");
            time = input.nextDouble();
            Speed = CalculateSpeed(distance, time);
            System.out.println("The speed is --> " + Speed + " m/s");

        }
        if (option == 5) {
            double Distance;
            double speed;
            double Time;
            System.out.println("Enter the speed in m/s ");
            speed = input.nextDouble();
            System.out.println("Enter the tima in seconds");
            Time = input.nextDouble();
            Distance = CalculateDistance(speed, Time);
            System.out.println("The Distance is --> " + Distance + " meter");

        }
        if (option == 6) {
            double initialvelocity;
            double finalvelocity;
            double Time2;
            double Acceleration;

            System.out.println("Enter the initial speed in m/s ");
            initialvelocity = input.nextDouble();
            System.out.println("Enter the final speed in m/s");
            finalvelocity = input.nextDouble();
            System.out.println("Enter the time in seconds");
            Time2 = input.nextDouble();
            Acceleration = CalculateAceleration(finalvelocity, initialvelocity, Time2);
            System.out.println("The Distance is --> " + Acceleration + " m/s^2 ");
        }

        if (option == 7) {

            System.out.println(" Good Bye");
            System.exit(0);

        }

    }

    private static void ShowMenuPhysicscalformulas() {
        System.out.println("4. -> Speed");
        System.out.println("5. -> Distance");
        System.out.println("6. -> Aceleration");
        System.out.println("7. -> Exit");
    }

    private static void ShowMenuAreas() {
        System.out.println("1. -> Area of a Diamond");
        System.out.println("2. -> Area of a Triangle");
        System.out.println("3. -> Area of a Circule");
    }

    private static double CalculateAreaDiamond(double Majordiagonal, double Minordiagonal) {
        double Areadiamond;
        Areadiamond = (Majordiagonal * Minordiagonal) / 2;
        return Areadiamond;
    }

    private static double CalculateAreaTriangle(double based, double heightri) {
        double Areatriangle;
        Areatriangle = (based * heightri) / 2;
        return Areatriangle;
    }

    private static double CalculateAreaCircle(double radio, double pi) {
        double Areacircle;
        Areacircle = radio * Math.sqrt(pi);
        return Areacircle;
    }

    private static double CalculateSpeed(double distance, double time) {
        double Speed;
        Speed = distance / time;
        return Speed;
    }

    private static double CalculateDistance(double speed, double Time) {
        double Distance;
        Distance = speed * Time;
        return Distance;
    }

    private static double CalculateAceleration(double finalvelocity, double initialvelocity, double Time2) {
        double Aceleration;

        Aceleration = (finalvelocity - initialvelocity) / Time2;
        return Aceleration;
    }
}

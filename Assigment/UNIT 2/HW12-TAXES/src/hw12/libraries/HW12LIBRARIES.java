/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.libraries;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class HW12LIBRARIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALCULE IVA OF A PRODUCT

        Scanner input = new Scanner(System.in);

        System.out.println("===============WELCOME==============");
        System.out.println("CHOOSE THE OPTION THAT YOU WANT TO DO");
        int option;

        System.out.println("1. -> CALCULATE IVA");
        System.out.println("2. -> CALCULATE TAX OF THE RENT");
        System.out.println("3. -> CALCULATE TAX OF DIVISAS");
        System.out.println("5. -> Exit");

        System.out.println(" ♦♦♦♦♦♦ Enter your menu option ♦♦♦♦♦♦ ");
        option = input.nextInt();

        if (option == 1) {
            double costofproduct;
            double percentage = 0.12;

            System.out.println("♦♦♦♦♦♦  Write the cost of the product ♦♦♦♦♦♦ ");
            costofproduct = input.nextInt();
            double TaxIva = CalculateTaxIVa(costofproduct, percentage);
            System.out.println(" The IVA of this product is --> " + TaxIva);

        }

        if (option == 2) {
            double income;
            double expenses;
            double taxbase;

            System.out.println("Write your income, please");
            income = input.nextDouble();
            System.out.println("Write your expensess");
            expenses = input.nextDouble();
            taxbase = CalculateTaxBase(income, expenses);
            System.out.println("Your taxbase is ->" + taxbase);

            if (taxbase <= 11212) {
                double Basicfraction = 0;

                double residue = taxbase - Basicfraction;
                double percentagetax = residue * 0.00;
                double Taxbasicfraction = 0;
                CalculateTaxRentCase1(Taxbasicfraction, percentagetax);
                System.out.println(" You shoul not do any contribution");

            } else {
                if (taxbase > 11212 && taxbase <= 14285) {
                    double Basicfraction = 11212;
                    double residue = taxbase - Basicfraction;
                    double percentagetax = residue * 0.05;
                    double Taxbasicfraction = 0;
                    double TaxRent = CalculateRentCase2(Taxbasicfraction, percentagetax);
                    System.out.println(" The Tax of the rent is " + TaxRent);

                } else {
                    if (taxbase > 14285 && taxbase <= 17854) {
                        double Basicfraction = 14285;
                        double residue = taxbase - Basicfraction;
                        double percentagetax = residue * 0.10;
                        double Taxbasicfraction = 154;
                        double TaxRent = CalculateTaxRentCase3(Taxbasicfraction, percentagetax);
                        System.out.println(" The Tax of the rent is " + TaxRent);

                    } else {
                        if (taxbase > 17854 && taxbase <= 21442) {
                            double Basicfraction = 17854;
                            double residue = taxbase - Basicfraction;
                            double percentagetax = residue * 0.12;
                            double Taxbasicfraction = 511;
                            double TaxRent = CalculateRentCase4(Taxbasicfraction, percentagetax);
                            System.out.println(" The Tax of the rent is " + TaxRent);

                        } else {
                            if (taxbase > 21442 && taxbase <= 42874) {
                                double Basicfraction = 21442;
                                double residue = taxbase - Basicfraction;
                                double percentagetax = CalculateTaxIVa(residue, 0.15);
                                double Taxbasicfraction = 941;
                                double TaxRent = CalculateTaxRentCase5(Taxbasicfraction, percentagetax);
                                System.out.println(" The Tax of the rent is " + TaxRent);

                            } else {
                                if (taxbase > 42874 && taxbase <= 64297) {
                                    double Basicfraction = 42874;
                                    double residue = taxbase - Basicfraction;
                                    double percentagetax = residue * 0.20;
                                    double Taxbasicfraction = 4156;
                                    double TaxRent = CalculateRentCase6(Taxbasicfraction, percentagetax);
                                    System.out.println(" The Tax of the rent is " + TaxRent);

                                } else {
                                    if (taxbase > 64297 && taxbase <= 85729) {
                                        double Basicfraction = 64297;
                                        double residue = taxbase - Basicfraction;
                                        double percentagetax = residue * 0.25;
                                        double Taxbasicfraction = 8440;
                                        double TaxRent = CalculateTaxRentCase7(Taxbasicfraction, percentagetax);
                                        System.out.println(" The Tax of the rent is " + TaxRent);

                                    } else {
                                        if (taxbase > 85729 && taxbase <= 114288) {
                                            double Basicfraction = 85729;
                                            double residue = taxbase - Basicfraction;
                                            double percentagetax = residue * 0.30;
                                            double Taxbasicfraction = 13798;
                                            double TaxRent = CalculateRentCase8(Taxbasicfraction, percentagetax);
                                            System.out.println(" The Tax of the rent is " + TaxRent);

                                        } else {
                                            if (taxbase > 114288) {
                                                double Basicfraction = 112288;
                                                double residue = taxbase - Basicfraction;
                                                double percentagetax = residue * 0.35;
                                                double Taxbasicfraction = 22366;
                                                double TaxRent = CalculateTaxRentCase9(Taxbasicfraction, percentagetax);
                                                System.out.println(" The Tax of the rent is " + TaxRent);

                                            }
                                        }
                                    }

                                }

                            }

                        }
                    }
                }
            }
        }

        if (option
                == 3) { /////DIVISIAS

            System.out.println("=============CALCULATE DIVISAS============");
            System.out.println("CHOOSE THE OPTION THAT YOU WANT TO DO");
            int option3;

            System.out.println("1. -> Bring or send money");
            System.out.println("2. -> International buys");

            System.out.println("♦♦♦♦♦♦ Enter the option that you want to do ♦♦♦♦♦♦ -> ");
            option3 = input.nextInt();

            if (option3 == 1) {
                double money;
                double taxforpay;
                double percentage = 0.05;

                System.out.println(" ♦♦♦♦♦♦ Write the money that you have for the trip ♦♦♦♦♦♦");
                money = input.nextDouble();
                if (money > 1200) {
                    taxforpay = CalculateTaxSendMoney(money);
                    System.out.println("The tax thar you must pay is ->" + taxforpay);

                } else {
                    if (money <= 1200) {
                        System.out.println(" You should not pay any tax");
                    }
                }
            }

            if (option3 == 2) {
                double valueofbuys;
                double Taxforbuys;
                double percentage = 0.05;

                System.out.println(" The cost of the buys that you have been");
                valueofbuys = input.nextDouble();
                if (valueofbuys > 5017.33) {
                    Taxforbuys = CalculateTaxInternationalBuys(valueofbuys, percentage);
                    System.out.println(" You should pay -> " + Taxforbuys + " for the buys");

                }
            }
        }
        if (option
                == 5) {
            System.out.println(" See you later friend");
        }
    }

    private static double CalculateTaxInternationalBuys(double valueofbuys, double percentage) {
        double Taxforbuys;
        Taxforbuys = (valueofbuys - 5017.33) * percentage;
        return Taxforbuys;
    }

    private static double CalculateTaxSendMoney(double money) {
        double taxforpay;
        taxforpay = (money - 1200) * 0.05;
        return taxforpay;
    }

    private static double CalculateTaxRentCase9(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateRentCase8(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateTaxRentCase7(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateRentCase6(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateTaxRentCase5(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateRentCase4(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateTaxRentCase3(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static double CalculateRentCase2(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
        return TaxRent;
    }

    private static void CalculateTaxRentCase1(double Taxbasicfraction, double percentagetax) {
        double TaxRent = Taxbasicfraction + percentagetax;
    }

    private static double CalculateTaxBase(double income, double expenses) {
        double taxbase;
        taxbase = income - expenses;
        return taxbase;
    }

    private static double CalculateTaxIVa(double costofproduct, double percentage) {
        double TaxIva = costofproduct * percentage;
        return TaxIva;
    }

    

}

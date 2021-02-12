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
            double TaxIva = GetTaxIva(costofproduct, percentage);
            System.out.println(" The IVA of this product is --> " + TaxIva);

        }

        if (option == 2) {
            double income;
            double expenses;
            double taxbase;

            taxbase = GetTaxBase(input);

            if (taxbase <= 11212) {
                ShowTaxRentcase1(taxbase);
            } else {
                if (taxbase > 11212 && taxbase <= 14285) {
                    ShowTaxRentCase2(taxbase);
                } else {
                    if (taxbase > 14285 && taxbase <= 17854) {
                        ShowTaxRentCase3(taxbase);
                    } else {
                        if (taxbase > 17854 && taxbase <= 21442) {
                            ShowTaxRentCase4(taxbase);
                        } else {
                            if (taxbase > 21442 && taxbase <= 42874) {
                                ShowTaxRentCase5(taxbase);
                            } else {
                                if (taxbase > 42874 && taxbase <= 64297) {
                                    ShowTaxRentCase6(taxbase);
                                } else {
                                    if (taxbase > 64297 && taxbase <= 85729) {
                                        ShowTaxRentCase7(taxbase);
                                    } else {
                                        if (taxbase > 85729 && taxbase <= 114288) {
                                            ShowTaxRentCase8(taxbase);
                                        } else {
                                            if (taxbase > 114288) {
                                                ShowTaxRentCase9(taxbase);
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

        if (option == 3) { /////DIVISIAS

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
                money = input.nextInt();
                if (money > 1200) {
                    CalculateTaxSendMoney(money);
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
                valueofbuys = input.nextInt();
                if (valueofbuys > 5017.33) {
                    CalculateTaxInternationalBuys(valueofbuys, percentage);
                }
            }
        }
        if (option == 5) {
            System.out.println(" See you later friend");
        }
    }

    private static void CalculateTaxInternationalBuys(double valueofbuys, double percentage) {
        double Taxforbuys;
        Taxforbuys = (valueofbuys - 5017.33) * percentage;
        System.out.println(" You should pay -> " + Taxforbuys + " for the buys");
    }

    private static void CalculateTaxSendMoney(double money) {
        double taxforpay;
        taxforpay = (money - 1200) * 0.05;
        System.out.println("The tax thar you must pay is ->" + taxforpay);
    }

    private static void ShowTaxRentCase9(double taxbase) {
        double Basicfraction = 112288;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.35;
        double Taxbasicfraction = 22366;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase8(double taxbase) {
        double Basicfraction = 85729;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.30;
        double Taxbasicfraction = 13798;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase7(double taxbase) {
        double Basicfraction = 64297;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.25;
        double Taxbasicfraction = 8440;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase6(double taxbase) {
        double Basicfraction = 42874;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.20;
        double Taxbasicfraction = 4156;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase5(double taxbase) {
        double Basicfraction = 21442;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.15;
        double Taxbasicfraction = 941;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase4(double taxbase) {
        double Basicfraction = 17854;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.12;
        double Taxbasicfraction = 511;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase3(double taxbase) {
        double Basicfraction = 14285;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.10;
        double Taxbasicfraction = 154;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentCase2(double taxbase) {
        double Basicfraction = 11212;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.05;
        double Taxbasicfraction = 0;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" The Tax of the rent is " + TaxRent);
    }

    private static void ShowTaxRentcase1(double taxbase) {
        double Basicfraction = 0;
        //calculate
        double residue = taxbase - Basicfraction;
        double percentagetax = residue * 0.00;
        double Taxbasicfraction = 0;
        double TaxRent = Taxbasicfraction + percentagetax;
        System.out.println(" You shoul not do any contribution");
    }

    private static double GetTaxBase(Scanner input) {
        double income;
        double expenses;
        double taxbase;
        System.out.println("Write your income, please");
        income = input.nextInt();
        System.out.println("Write your expensess");
        expenses = input.nextInt();
        taxbase = income - expenses;
        System.out.println("Your taxbase is ->" + taxbase);
        return taxbase;
    }

    public static double GetTaxIva(double costofproduct, double percentage) {
        double TaxIva;
        double Totalcost;

        TaxIva = costofproduct * 0.12;
        Totalcost = costofproduct + TaxIva;

        return TaxIva;
    }

}

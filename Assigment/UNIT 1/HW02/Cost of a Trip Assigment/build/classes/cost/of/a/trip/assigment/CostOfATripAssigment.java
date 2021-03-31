/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cost.of.a.trip.assigment;

/**
 *
 * @author Sony Vaio
 */
public class CostOfATripAssigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //My family and I decided to travel to Italy, the personal cost of the trip is n
    
        int n;
        int people;
        int  cash;
        
        n = 3450;
        people = 5;
        
        //operation
        
       cash = n * people;
       
       System.out.println( "The cost of the trip in cash " + n + " * " + people + " is equal to --> " + cash);
       
       //We decided to pay for the trip with a credit 
       //For this reason we must pay a interest of 7%
       
       float interest;
       
       //operation
      
       interest = (float) (cash * 0.07);
       
       System.out.println("The interest is " + (cash) + " * " + 0.07 + "is equal to --> " + interest );
       
       // We decided to defer to 12 months that is 12 payments
       
       float payments;
       float cost;
       
       //operation
               
       cost = cash + interest;
  
       payments = (float) ((cost)/12 );
       
       System.out.println("the payment is " + cost + " / " + 12 + "is equal to --> " + payments);
       
       //our trip will be paid in payment of 1538.125  
       //The total cost of the trip will be very high
       // I had stimated an extra budget for additional services
       
       short money;
       short days;
       short extracash;
       short budget;
       
       money = 70;
       days = 3;
        
       
       //operation
       extracash = (short) (money * days) ;
       
       System.out.println(" For additional services I have " + money + " * " + days + " is equal to --> " + extracash);
       
       //I had a problem for this reason I reduce my budget whith $10 every day
       
       budget = (short) (money - 10);
       
       System.out.println(" The new budget is " + money + " - " + 10 + "is equal to --> " + budget);
    }
    
}


    

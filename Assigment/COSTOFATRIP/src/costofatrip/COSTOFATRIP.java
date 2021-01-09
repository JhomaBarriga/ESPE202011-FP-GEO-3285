package costofatrip;

/**
 *
 * @author Sony Vaio
 */
public class COSTOFATRIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //My family and I decided to travel to Italy, the personal cost of the trip is n
    
        short n;
        short people;
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
      
       int totalcost;
      //operation
       
       totalcost = (int)(float)((payments * 12));
       
       System.out.println("The total cost of the trip is " + (payments)+ " * " + 12 + " is equal to --> " + totalcost);
       
       //The total cost of the trip whit all payments is the 18457
       
       
       
       
       
       
      
   
               
       
       
        
       
     
       
                
        
    }
    
}

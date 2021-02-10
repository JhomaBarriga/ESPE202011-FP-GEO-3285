/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author Sony Vaio
 */
public class WS12LIBRARIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //IF WE HAVE THE MATH LIBRARY
        //WE IMPORT AND USE IT
        
        float squareRoot=0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue = 0.0F;
        
        
        number = 9; //squereRoot = ? -> 3
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
        
        number = 49; // 
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
        
        number = 5; //? 2.23...
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of -> " + number + "is equal ->" + squareRoot );
       
        base = 3;
        exponent = 2;
        //power = 9?
        power = (float)computePower(base,exponent);
        System.out.println( base + " ^ " + exponent +  " = " + power);

        base = 2;
        exponent = 4;
        //power = 16 ?
        power = (float)computePower(base,exponent);
        System.out.println( base + " ^ " + exponent +  " = " + power);
        
        base = 78;
        exponent = 5;
        //calculator 78^5 is  2887174368
        power = (float)computePower(base,exponent);
        System.out.println( base + " ^ " + exponent +  " = " + power);
        
        number = -5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("The absolute value of -> " + number + " is " + absoluteValue );
        
    
        //if we dont have the library,waht woul we do?
        //we should create the feature, the library
        //our own algortihm to compute the square library
       
    }
    
    public static float computePower(float base, float exponent){
        float power;
        power = 1.0F;
        
        for(int i =1 ; i<=(int)exponent;i++){
            power =  power*base;
        }
        return power;
    }
     
    
    private static float getAbsoluteValue(float number){
        if(number < 0){
            return -number;
        }else{
            return number;
        } 
    }
    
}

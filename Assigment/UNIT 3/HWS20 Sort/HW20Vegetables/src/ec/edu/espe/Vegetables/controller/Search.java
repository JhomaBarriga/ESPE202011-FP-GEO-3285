/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Vegetables.controller;

/**
 *
 * @author Sony Vaio
 */
public class Search {
    
  
    public static int findVegetable(String[] vegetables, String searchVegetable) {
       for (int i = 0; i < 6; i++) {
            if (searchVegetable.equals(vegetables[i])) {
                return 1;
            }
        }
    return -1;
    }
}
    


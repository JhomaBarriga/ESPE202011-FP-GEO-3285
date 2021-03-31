/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.City.Controller;

import UTILS.FileManager;
import ec.edu.espe.City.Model.City;

/**
 *
 * @author Sony Vaio
 */
public class CityController {
      public void save(City city) {
        String data = city.getName() + ";" + city.getSize() + ";" + city.getPopulation() + ";" + city.getGuy() + " ; " + city.getNumberMall();
        FileManager.save(data," city ");
    }

    public String read() {
     
        String data;
        data = FileManager.read(" city.csv");
        return data;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espè.supermarket.controller;

import UTILS.FileManager;
import ec.edu.espe.Supermarket.model.Vegetables;

/**
 *
 * @author Sony Vaio
 */
public class VegetablesController {

    public void save(Vegetables vegetables) {
        String data = vegetables.getName() + ";" + vegetables.getColor() + ";" + vegetables.getCant() + ";" + vegetables.getCost();
        FileManager.save(data, "vegetables");

    }

    public String read() {

        String data;
        data = FileManager.read("vegetables.csv");
        return data;
    }
}

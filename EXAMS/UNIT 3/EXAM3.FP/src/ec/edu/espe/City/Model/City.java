/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.City.Model;

/**
 *
 * @author Sony Vaio
 */
public class City {
    private String Name;
    private int population;
    private String Size;
    private String Guy;
    private int numberMall;

    public City(String Name, int population, String Size, String Guy, int numberMall) {
        this.Name = Name;
        this.population = population;
        this.Size = Size;
        this.Guy = Guy;
        this.numberMall = numberMall;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * @return the Guy
     */
    public String getGuy() {
        return Guy;
    }

    /**
     * @param Guy the Guy to set
     */
    public void setGuy(String Guy) {
        this.Guy = Guy;
    }

    /**
     * @return the numberMall
     */
    public int getNumberMall() {
        return numberMall;
    }

    /**
     * @param numberMall the numberMall to set
     */
    public void setNumberMall(int numberMall) {
        this.numberMall = numberMall;
    }
    
            
}

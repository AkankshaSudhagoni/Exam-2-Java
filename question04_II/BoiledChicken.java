/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_II;

/**
 *
 * @author S542046
 */
public class BoiledChicken extends Chicken {

    private double temperature;

    public BoiledChicken(double temperature, double grams, double cost, String type) {
        super(grams, cost, type);
        this.temperature = temperature;

    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature=" + temperature + '}';
    }

    public void temp() {
        int temp = 0;
        if (temp >= 165.7) {
            System.out.println("cooked");
        } else {
            System.out.println("not cooked");
        }
    }
}

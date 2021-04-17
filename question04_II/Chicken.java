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
public class Chicken {

    double grams;
    double cost;
    private String type;

    public Chicken(double grams, double cost, String type) {
        this.grams = grams;
        this.cost = cost;
        this.type = type;
    }

    public double getGrams() {
        return grams;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "grams=" + grams + ", cost=" + cost + ", type=" + type;
    }

    public double bill() {
        double bill;
        return bill = cost * grams;
    }

}

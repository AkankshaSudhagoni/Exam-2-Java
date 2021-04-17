/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_I;

/**
 *
 * @author akanksha Sudhagoni
 */
public class Tiffins {

    private double cost;
    private String firstName;
    private String lastName;

    public Tiffins(double cost, String firstName, String lastName) {
        this.cost = cost;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String customerName() {
        return firstName + "." + lastName;
    }

    @Override
    public String toString() {
        return "cost: " + cost + "\nfirst Name: " + firstName + "\nlast Name: " + lastName;

    }
}

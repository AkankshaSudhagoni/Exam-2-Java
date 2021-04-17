/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_I;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class NorthIndiaBreakfast extends Tiffins {

    private String breakfastName;

    public NorthIndiaBreakfast(String breakfastName, double cost, String firstName, String lastName) {
        super(cost, firstName, lastName);
        this.breakfastName = breakfastName;
    }

    public String getBreakfastName() {
        return breakfastName;
    }

    public double totalCost() {
        double noOfPlates = 5;
        double cost = super.getCost() * noOfPlates;
        return cost;
    }

    private String customerName() {
        return super.getFirstName().substring(0, 1) + "." + super.getLastName().substring(super.getLastName().indexOf(" ") + 1, super.getLastName().indexOf(" ") + 2);
    }

    public boolean isAvailable(String bName) {
        boolean x = false;
        if (breakfastName.equals(bName)) {
            x = true;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "break fast Name" + breakfastName
                + "\ncustomer initials: " + customerName()
                + "\ntotal cost: " + totalCost();
    }

}

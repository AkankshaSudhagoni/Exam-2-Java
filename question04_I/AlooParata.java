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
public class AlooParata extends NorthIndiaBreakfast {

    private final double price;
    private int numberOfPlates;

    public AlooParata(double price, int numberOfPlates, String breakfastName, double cost, String firstName, String lastName) {
        super(breakfastName, cost, firstName, lastName);
        this.price = price;
        this.numberOfPlates = numberOfPlates;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfPlates() {
        return numberOfPlates;
    }

    private String customerName() {
        return super.getFirstName().substring(0, 1);
    }

    @Override
    public double totalCost() {
        return numberOfPlates * price;

    }

    @Override
    public String toString() {
        return "price of aloo parata: " + price
                + "\nno of plates: " + numberOfPlates
                + "\nfirst letter: " + customerName()
                + "\ntotal Cost" + totalCost();
    }

}

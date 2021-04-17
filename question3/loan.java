/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class loan {

    private double interest;
    private double amount;

    public loan(double interest, double amount) {
        this.interest = interest;
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public double getAmount() {
        return amount;
    }

    public double totalAmountToPay() {
        double total = amount + interest;
        return total;
    }

    @Override
    public String toString() {
        return "interest: " + interest + "\namount: " + amount + "\namount to pay: " + totalAmountToPay();
    }

}

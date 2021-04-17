/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08_I;

/**
 *
 * @author S542046
 */
public class EarRings extends Gold {

    private double priceOfEarring;
    private double EarringsWeight;

    public EarRings(double priceOfEarring, double EarringsWeight, String nameOfCustomer, double price, int weight) {
        super(nameOfCustomer, price, weight);
        this.priceOfEarring = priceOfEarring;
        this.EarringsWeight = EarringsWeight;
    }

    public double getPriceOfEarring() {
        return priceOfEarring;
    }

    public double getEarringsWeight() {
        return EarringsWeight;
    }

    @Override
    public double getCost() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return priceOfEarring * EarringsWeight;
    }

    @Override
    public String stringMethod() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (super.getNameOfCustomer().substring(0, 1)) + " " + (super.getNameOfCustomer().substring(1, 2));
    }

    @Override
    public String toString() {
        return "price Of Earring: " + priceOfEarring + "\nweight of earrings: " + EarringsWeight
                + "\ncost: " + getCost() + "\ntwo letters of name: " + stringMethod();
    }

}

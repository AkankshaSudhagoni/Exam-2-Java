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
public class GrilledChicken extends Chicken {

    private String shopName;

    public GrilledChicken(String shopName, double grams, double cost, String type) {
        super(grams, cost, type);
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public String toString() {
        return super.toString() + "GrilledChicken{" + "shopName=" + shopName + '}';
    }

    public double finalbill() {
        double finalbill;
        double tax = 15.5;
        return finalbill = super.bill() + tax;
    }

}

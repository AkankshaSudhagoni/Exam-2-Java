/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_II;

import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class ChickenDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter grams: ");
        double grams = scan.nextDouble();
        System.out.print("Enter cost: ");
        double cost = scan.nextDouble();
        System.out.print("Enter type: ");
        String type = scan.next();
        System.out.print("Temperature: ");
        double temperature = scan.nextDouble();
        System.out.print("ShopName: ");
        String ShopName = scan.next();

        Chicken ck = new Chicken(grams, cost, type);
        System.out.println("chicken: " + ck.toString());
        System.out.println("bill: " + ck.bill());
        BoiledChicken BK = new BoiledChicken(temperature, grams, cost, type);
        System.out.println("boiledchicken:" + BK.toString());
        System.out.print("coocked or not: ");
        BK.temp();
        GrilledChicken GK = new GrilledChicken(ShopName, grams, cost, type);
        System.out.println("grilledChicken: " + GK.toString());
        System.out.println("finalbill: " + GK.finalbill());

    }

}

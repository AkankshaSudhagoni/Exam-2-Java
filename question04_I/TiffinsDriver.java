/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_I;

import java.util.Scanner;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class TiffinsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breakfast name: ");
        String breakfastName = sc.next();
        System.out.print("Enter the cost:");
        double cost = sc.nextDouble();
        System.out.print("Enter first name: ");
        String firstName = sc.next();
        System.out.print("Enter last name: ");
        String lastName = sc.next();
        System.out.print("Enter number of plates: ");
        int numberOfPlates = sc.nextInt();
        System.out.print("Enter the price of alooparata: ");
        double price = sc.nextDouble();
        NorthIndiaBreakfast nb = new NorthIndiaBreakfast(breakfastName, cost, firstName, lastName);
        AlooParata ap = new AlooParata(price, numberOfPlates, breakfastName, cost, firstName, lastName);
        System.out.println(nb.toString());
        System.out.println(ap.toString());
    }

}

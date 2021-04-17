/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_II;

import java.util.Scanner;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class StationaryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The color of the pencil is: " + Stationary.PENCIL.getColor());

        for (Stationary st : Stationary.values()) {
            System.out.println(st + "\ncolor of the item: " + st.getColor());
            System.out.println(st + "\ncost of an item: " + st.getCost());

        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_I;

/**
 *
 * @author Akanksha sudhagoni
 *
 */
public class MakeupDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("cost after discount: " + Makeup.LIPSTICK.costAfterDiscount());
        for (Makeup m : Makeup.values()) {
            System.out.println(m + "\ncost is: " + m.getCost() + "\nDuration: " + m.getDuration());
        }
    }

}

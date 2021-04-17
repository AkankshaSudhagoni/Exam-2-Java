/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_2;

import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Automoblies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        double distance = scan.nextDouble();
        System.out.println("Enter the time taken: ");
        double time = scan.nextDouble();
        System.out.println("Total number of Seats:");
        int totalNumberofseats = scan.nextInt();
        System.out.println("Empty Seats: ");
        int emptyseats = scan.nextInt();

        Automoblies v;
        v = new Automoblies(distance, time, totalNumberofseats, emptyseats);
        System.out.println(v.toString());
        System.out.println("car acceleration= " + v.accelerationCalculation());
        System.out.println("seatsFilled in bus= " + v.seatsFilled());
    }

    private Automoblies(double distance, double time, int totalNumberofseats, int emptyseats) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String accelerationCalculation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String seatsFilled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

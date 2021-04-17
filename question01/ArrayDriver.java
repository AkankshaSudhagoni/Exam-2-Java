/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class ArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner input = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Prompt ther user to enter 10 integers
        System.out.print("Enter 10 integers: ");
        for (int integer = 0; integer < 10; integer++) {
            list.add(input.nextInt());
        }

        // Invoke removeDuplicate method
        removeDuplicate(list);

        // Display the distinct integers
        System.out.print("The distinct integers are ");
        for (int disint = 0; disint < list.size(); disint++) {
            System.out.print(list.get(disint) + " ");
        }
        System.out.println();
    }

    /**
     * Removes the duplicate elements from an array list of integers
     */
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }

}

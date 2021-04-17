/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;
import question3.loan;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class arraylistdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> o = new ArrayList<Object>();
        o.add(new loan(50, 500));
        o.add(new Date());
        o.add(new String("String class"));
        o.add(new circle(6.7, 60));

        // Display all the elements in the list by
        // invoking the object’s toString() method
        for (int i = 0; i < o.size(); i++) {
            System.out.println((o.get(i)).toString());
        }
    }

}

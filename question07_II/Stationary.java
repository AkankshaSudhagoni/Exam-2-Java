/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_II;

/**
 *
 * @author Akanksha Sudhagoni
 */
public enum Stationary {
    PEN("red", 2),
    PENCIL("black", 1),
    PAPER("yellow", 5);
    private String color;
    private final int cost;

    private Stationary(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

}

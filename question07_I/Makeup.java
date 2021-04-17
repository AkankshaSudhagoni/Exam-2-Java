/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_I;

/**
 *
 * @author Akanksha Sudhagoni
 */
public enum Makeup {
    LIPSTICK(50, 10),
    MASCARA(5, 14),
    BLUSH(7, 5);
    private final int cost;
    private final int duration;

    private Makeup(int cost, int duration) {
        this.cost = cost;
        this.duration = duration;

    }

    public int getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }

    public double costAfterDiscount() {
        double discount = 5;
        return cost - discount;
    }

}

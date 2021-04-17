/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class circle {

    private double radius;
    private double angle;

    public circle(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public double getRadius() {
        return radius;
    }

    public double getAngle() {
        return angle;
    }

    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "radius: " + radius + "\nangle: " + angle
                + "\narea of the circle: " + area();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1;

/**
 *
 * @author DELL
 */
public class Point<T> {

    double x;
    double y;
    Point next;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        next = null;
    }

    @Override
    public String toString() {
        return "Point: " + x + ", " + y;
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y- p.y;
        double distance = (double) (Math.sqrt(dx * dx + dy * dy));
        return distance;
    }

}

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
public class Polygon<T> {

    Point first;
    Point last;
    int size;

    public Polygon() {
        first = null;
        last = null;
        size = 0;
    }

    public Polygon(double x, double y) {
        Point<T> p = new Point<T>(x, y);
        first = p;
        last = p;
    }

    public Polygon(LinkedQueue q) {
        if (!Isclosed(this)) {
            while (!q.isEmpty()) {
                Point<T> temp = (Point) q.dequeue();
                this.insertFirst(temp);
            }
        }
    }

    public Polygon(LinkedStack s) {
        if (!Isclosed(this)) {
            while (!s.isEmpty()) {
                Point<T> temp = (Point) s.pop();
                this.insertFirst(temp);
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFirst(Point<T> p) {
        if (last == null) {
            last = p;
        } else {
            p.next = first;
            first = p;
        }
    }

    public void insertLast(Point<T> p) {
        if (first == null) {
            first = p;
        } else {
            last.next = p;
            last = p;
        }

    }

    public void removeFirst() {
        first = first.next;
        if (first == null) {
            last = null;
        }
    }

    public void removeLast() {
        Point<T> tmp, previous;
        tmp = first;
        previous = null;
        while (tmp != last) {
            previous = tmp;
            tmp = tmp.next;
        }
        if (previous == null) {
            first = null;
        } else {
            previous.next = null;
        }
        last = previous;
    }

    public String toString() {
        Point tmp = first;
        String result = "";
        while (tmp != null) {
            result += (String) "x:" + tmp.x + ",y:" + tmp.y;
            System.out.println("");
            tmp = tmp.next;
        }
        if (!Isclosed(this)) {
            result += "Polygon is open";
        } else {
            result += "Polygon is closed";
        }
        return result;
    }

    public int countofPoints() {
        Point<T> tmp = first;
        while (tmp != null) {
            tmp = tmp.next;
            this.size++;
        }
        return this.size;
    }

    public void reverseOrder(Polygon p) {
        Point tmp = first;
        Point previous = null;
        Point current = null;
        while (tmp != null) {
            current = tmp;
            tmp = tmp.next;
            current.next = previous;
            previous = current;
            first = current;
        }
    }

    public boolean Isclosed(Polygon p) {
        if (p.last.next == p.first) {
            System.out.println("Polygon is closed");
            return true;
        } else {
            return false;
        }

    }

    public void closeitself(Polygon p) {
        if (!Isclosed(p)) {
            p.last.next = p.first;
        }
    }

    public void getClosed(double x, double y) {
        Point<T> newPoint = new Point<T>(x, y);
        if (this.first.equals(newPoint)) {
            closeitself(this);
        }
    }

    public Polygon mergePolygon(Polygon p1, Polygon p2) {
        Polygon result = new Polygon();

        Point tmp = p1.first;
        while (tmp != null) {
            result.insertLast(tmp);
            tmp = tmp.next;
            first = null;
            first = tmp;
        }

        Point temp = p2.first;
        while (temp != null) {
            result.insertLast(temp);
            temp = temp.next;
            first = null;
            first = temp;
        }

        return result;
    }

    public double totalLengthofPolygon(Polygon p) {
        Point tmp = first.next;
        double totallength = 0;
        if (!Isclosed(p)) {
            for (int i = 0; i < p.size - 1; i++) {
                totallength += p.first.distance(tmp);
                tmp = tmp.next;
                first = first.next;
            }
        }
        if (Isclosed(p)) {
            for (int i = 0; i < p.size; i++) {
                totallength += p.first.distance(tmp);
                tmp = tmp.next;
                first = first.next;
            }
        }
        return totallength;
    }

    public double calculateArea(Polygon c) {
        Point tmp = c.first.next;
        double nominator = 0;
        double denominator = 2.0;
        double area = 0;
        if (Isclosed(c)) {
            int counter = 0;
            while (counter < c.size) {
                nominator += (c.first.x * tmp.y - c.first.y * tmp.x);
                first = tmp;
                tmp = tmp.next;
                counter++;

            }
        }
        area = nominator / denominator;
        Math.abs(area);
        return area;
    }

    public Point[] givenoutasArray(Polygon p) {
        Point[] array = new Point[p.size];
        for (int i = 0; i < array.length; i++) {
            array[i] = p.first;
            p.first = p.first.next;
        }
        return array;
    }
}

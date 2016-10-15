// package murach.circle;

package ch10_ex4_Circle.src.murach.circle;

public class Circle {
    private double radius;
    
    public Circle() {
        radius = 0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getCircumference() {
        return 2 * 3.14159 * radius;
    }
    
    public double getArea() {
        return 3.14159 * radius * radius;
    }
    
    public double getDiameter() {
        return radius * 2;
    }
}

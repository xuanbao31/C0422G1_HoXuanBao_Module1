package ss5_accessmodifier_staticmethod_staticproperty.bai_tap;

import ss1_introduction.thuc_hanh.Area;

public class Circle {
    private double radius=1.0;
    private String color= "red";
    public float r;
    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}
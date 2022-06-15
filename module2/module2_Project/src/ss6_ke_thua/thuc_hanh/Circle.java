package ss6_ke_thua.thuc_hanh;

public class Circle extends Shape{
    public double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPremiter(){
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+getRadius()+", which is a sbclass of"+super.toString();
    }
}

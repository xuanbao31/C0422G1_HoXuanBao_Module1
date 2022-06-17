package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.stuent;

import ss5_accessmodifier_staticmethod_staticproperty.bai_tap.Circle.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Nhập bán kính");
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        Circle circle = new Circle(radius, "sky blue");
        System.out.println(circle.getColor() + " " + circle.getRadius() + " " + circle.getArea());

        System.out.println("Nhập bán kính 2");
        double radius2 = Double.parseDouble(scanner.nextLine());
        Circle circle1 = new Circle(radius2, "sky pink");
        System.out.println(circle1.getColor() + " " + circle1.getRadius() + " " + circle1.getArea());
    }
}

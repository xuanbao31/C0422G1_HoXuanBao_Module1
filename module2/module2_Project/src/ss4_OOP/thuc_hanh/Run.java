package ss4_OOP.thuc_hanh;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle " + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

    }
    }

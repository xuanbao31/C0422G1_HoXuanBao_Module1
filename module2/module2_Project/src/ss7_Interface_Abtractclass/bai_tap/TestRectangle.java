package ss7_Interface_Abtractclass.bai_tap;

import sun.security.util.Length;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        System.out.println("Nhập chiều rộng");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài");
        double length=scanner.nextDouble();
        rectangle.setWidth(width);
        rectangle.setLength(length);
        rectangle.resize(7);
        System.out.println("Diện tích sau khi thay đổi: "+rectangle.getArea());


    }
}

package ss7_Interface_Abtractclass.bai_tap;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Square square = new Square(3,"blue",false);
        System.out.println(square);
        square.resize(4);
        System.out.println("Diện tích sau khi thay đổi độ dài : "+square.getArea());
    }
}

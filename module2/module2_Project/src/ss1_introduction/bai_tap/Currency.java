package ss1_introduction.bai_tap;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter your USD");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        System.out.println("so tien cua ban nhap: " + usd);
        int vnd = usd * 23000;
        System.out.println(usd + "=" + vnd+"VND");
        System.out.println("Enter your VND");
        int vietnam = scanner.nextInt();
        System.out.println("So tien cua ban nhap" + vietnam);
        int dola = vietnam / 23000;
        System.out.println(vietnam + "=" + dola+"USD");
    }
}

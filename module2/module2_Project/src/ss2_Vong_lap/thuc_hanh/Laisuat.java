package ss2_Vong_lap.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Laisuat {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien gui");
        money = scanner.nextDouble();
        System.out.println("nhap so thang ban gui");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat");
        interestRate = scanner.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tong so tien lai: " + total);
    }
}

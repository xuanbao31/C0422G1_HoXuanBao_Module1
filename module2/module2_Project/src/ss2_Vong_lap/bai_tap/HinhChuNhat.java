package ss2_Vong_lap.bai_tap;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        System.out.println("Menu");
        int choice = -1;
        System.out.println("1.Ve hinh chu nhat ");
        System.out.println("2.Ve hinh tam giac vuong o botton left");
        System.out.println("3.Ve hinh tam giac vuong o top left");
        System.out.println("4.Ve tam giac can");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 6; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <=3 ; i++) {
                    for (int j = 1; j <=3-i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j=1 ; j<=2*i+1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }
}

package ss1_introduction.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the number of years");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear == true) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is a not leap year");
        }
    }
}

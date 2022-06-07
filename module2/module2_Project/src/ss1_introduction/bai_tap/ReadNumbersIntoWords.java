package ss1_introduction.bai_tap;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        System.out.println("Enter your Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Số Bạn Vừa Nhập :" + number);
        if (number < 10 && number >= 0) {
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nighteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int units = number % 10;
            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Fourty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (units) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number >= 100 && number < 1000) {

            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;
            switch (hundreds) {
                case 1:
                    System.out.print("One hundreds");
                    break;
                case 2:
                    System.out.print("Two hundreds");
                    break;
                case 3:
                    System.out.print("Three hundreds");
                    break;
                case 4:
                    System.out.print("Four hundreds");
                    break;
                case 5:
                    System.out.print("Five hundreds");
                    break;
                case 6:
                    System.out.print("Six hundreds");
                    break;
                case 7:
                    System.out.print("Seven hundreds");
                    break;
                case 8:
                    System.out.print("Eight hundreds");
                    break;
                case 9:
                    System.out.print("Nine hundreds");
                    break;
            }
            if (tens == 1) {
                switch (units) {
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nighteen");
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        System.out.print("Twenty");
                        break;
                    case 3:
                        System.out.print("Thirty");
                        break;
                    case 4:
                        System.out.print("Fourty");
                        break;
                    case 5:
                        System.out.print("Fifty");
                        break;
                    case 6:
                        System.out.print("Sixty");
                        break;
                    case 7:
                        System.out.print("Seventy");
                        break;
                    case 8:
                        System.out.print("Eighty");
                        break;
                    case 9:
                        System.out.print("Ninety");
                        break;
                }
                switch (units) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }
        }
    }
}
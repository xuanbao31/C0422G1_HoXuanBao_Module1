package ss3_Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class OmeraSectionFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {0, 2, 3, 4, 5, 11, 7, 9, 10};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter your number");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                for (int j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[numbers.length - 1] = 0;

            }

        }
        System.out.println(Arrays.toString(numbers));

    }
}

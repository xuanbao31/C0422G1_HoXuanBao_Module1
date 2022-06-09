package ss3_Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng ");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử");
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min = array [0];

            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min=array[i];
                }
            }
            System.out.println(min);

    }
}

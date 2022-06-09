package ss3_Mang.bai_tap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng");
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử có trong mảng");
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập độ dài mảng");
        int size2 = Integer.parseInt(input.nextLine());
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập phần tử có trong mảng");
            array2[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(array2));
        int [] array3=new int[size + size2];
        for (int i = 0; i < array.length; i++) {
            array3[i]=array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array.length+i]=array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}

package ss3_Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        System.out.println("Nhap do dai mang ");
//        Scanner input = new Scanner(System.in);
//        int size = Integer.parseInt(input.nextLine());
//        int []array=new int[size];
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println("Nhap phan tu co trong mang ");
//            array[i]=Integer.parseInt(input.nextLine());
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Nhap do dai mang ")
//        int size2 = Integer.parseInt(input.nextLine());
//        int []array2=new int[size2];
//        for (int i = 0; i <array2.length ; i++) {
//            System.out.println("Nhap phan tu co trong mang ");
//            array[i]=Integer.parseInt(input.nextLine());
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(input.nextLine());
        System.out.println("Nhập độ dài mảng con");
        int size2 = Integer.parseInt(input.nextLine());
        int[][] array = new int[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhap phan tu thu " + (j + 1));
                array[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

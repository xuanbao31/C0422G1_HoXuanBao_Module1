package ss3_Mang.bai_tap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddTheSectionElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap do dai mang ");
        int size =Integer.parseInt(input.nextLine());
        int []array=new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Nhap phan tu co trong mang");
            array[i]=Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập vị trí thêm số mới vào");
        int index = Integer.parseInt(input.nextLine());
        if (index <= -1 || index >= array.length) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            System.out.println("Nhập số muốn thêm");
            int number = Integer.parseInt(input.nextLine());
            for (int i =array.length-1 ; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}

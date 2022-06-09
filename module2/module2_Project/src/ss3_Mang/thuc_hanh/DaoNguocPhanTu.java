package ss3_Mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
//        for (int j = 0; j <array.length/2 ; j++) {
//            int temp = array[j];
//            array[j]=array[size-1-j];
//            array[size-1-j]=temp;
//        }
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int Gia;
            Gia =array [first];
           array [first] =array [last];
           array[last] = Gia;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(array));
    }
}

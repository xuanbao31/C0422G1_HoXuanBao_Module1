package ss15_Debug_Fig.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public  class ArrayExample {
    public static Integer[] creatRandom(){
        Random random = new Random();
        Integer [] arr =new Integer[100];
        System.out.println("Danh sách phần tử của mảng");
        for (int i = 0; i < 100; i++) {
            arr[i]= random.nextInt(100);
            System.out.println(arr[i]+" ");
        }
          return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.creatRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }


}

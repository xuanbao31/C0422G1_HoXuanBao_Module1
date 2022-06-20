package ss10_DSA_Stack_Queue.bai_tao;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập số lượng phần tử bạn muốn");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử có trong mảng");
            stack.push(scanner.nextLine());
        }
        String[] arr = new String[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();

        }
        System.out.println(Arrays.toString(arr));

    }

}
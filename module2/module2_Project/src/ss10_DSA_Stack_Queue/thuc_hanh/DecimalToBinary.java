package ss10_DSA_Stack_Queue.thuc_hanh;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack <Integer>  stack=new Stack<>();
        System.out.println("Nhập số bạn muốn đổi");
        int number=Integer.parseInt(scanner.nextLine());
        int x;
        do {
            x=number%2;
           stack.push(x);
            number=number/2;
        }while (number>0);
        System.out.println(stack.size());
        String Result=" ";
        while (!stack.isEmpty()){
            Result= Result+stack.pop();
        }
        System.out.println(Result);
    }
}

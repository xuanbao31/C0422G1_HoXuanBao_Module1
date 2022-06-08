package ss2_Vong_lap.thuc_hanh;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        a= input.nextInt();
        System.out.println("Enter b");
        b= input.nextInt();
        a=Math.abs(a);//Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        b=Math.abs(b);//Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        while (a==0||b==0){
            System.out.println("Khong co uoc chung lon nhat");
        }
        while (a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("uoc chung lon nhat :"+a);
    }

}

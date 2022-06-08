package ss2_Vong_lap.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        int count =0;
        int N=2;
        boolean snt =true;
        while (count<number){
            for (int i = 2; i <N ; i++) {
                snt =true;
                if (N%i==0){
                    snt=false;
                    break;
                }
            }
            if (snt){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}

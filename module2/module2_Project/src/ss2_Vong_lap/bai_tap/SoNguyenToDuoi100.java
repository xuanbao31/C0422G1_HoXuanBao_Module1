package ss2_Vong_lap.bai_tap;

import java.util.Scanner;

public class SoNguyenToDuoi100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            boolean snt = true;
            for (int i = 2; i < N; i++) {
                snt = true;
                if (N % i == 0) {
                    snt = false;
                    break;
                }
            }
            if (snt) {
                System.out.println(N);
            }
            N++;
        }

    }
}


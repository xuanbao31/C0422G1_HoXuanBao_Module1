package ss7_Interface_Abtractclass.thuc_hanh;

import java.util.Arrays;

public class RunCirlce {
    public static void main(String[] args) {
        CormparableCircle[]circles=new CormparableCircle[4];
        circles[0]=new CormparableCircle(4);
        circles[1]=new CormparableCircle(3);
        circles[2]=new CormparableCircle(2);
        circles[3]=new CormparableCircle(9);
        System.out.println("Sắp xếp trước");
        for (CormparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println();
        for (CormparableCircle circle : circles){
            System.out.println(circle);
        }
    }

}

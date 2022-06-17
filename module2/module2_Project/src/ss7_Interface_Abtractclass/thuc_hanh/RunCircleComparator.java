package ss7_Interface_Abtractclass.thuc_hanh;

import ss6_ke_thua.bai_tap.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class RunCircleComparator {
    public static void main(String[] args) {
        Circle[] cirles=new Circle[3];
        cirles[0]=new Circle(2);
        cirles[1]=new Circle(11);
        cirles[2]=new Circle(10);
        System.out.println(" trước khi Sắp xếp ");
        for (Circle circle:cirles){
            System.out.println(circle);
        }
        Comparator circleComparator=new CirleComparator();
        Arrays.sort(cirles,circleComparator);
        System.out.println("Sau khi sắp xếp");
        for (Circle circle:cirles){
            System.out.println(circle);
        }
    }
}

package ss7_Interface_Abtractclass.thuc_hanh;

import ss6_ke_thua.bai_tap.Circle;

import java.util.Comparator;

public class CirleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() < o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else return 0;
    }
}

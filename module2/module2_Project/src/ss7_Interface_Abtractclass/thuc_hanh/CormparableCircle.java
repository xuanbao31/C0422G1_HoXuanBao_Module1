package ss7_Interface_Abtractclass.thuc_hanh;

import ss6_ke_thua.bai_tap.Circle;

public class CormparableCircle extends Circle implements Comparable<CormparableCircle> {

    public CormparableCircle(double radius) {
        super(radius);
    }

    public CormparableCircle() {

    }

    @Override
    public int compareTo(CormparableCircle o) {
//        if (getRadius() > o.getRadius()) return 1;
//        else if (getRadius() < o.getRadius()) return -1;
//        else return 1;
        return (int) (this.getRadius()-o.radius);
    }


}

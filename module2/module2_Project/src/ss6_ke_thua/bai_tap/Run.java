package ss6_ke_thua.bai_tap;

public class Run {
    public static void main(String[] args) {
        Circle circle=new Circle(5,"sky blue");
        System.out.println(circle);
        System.out.println(circle.getArea());
        Cylinder cylinder =new Cylinder(7,"sky pink",8);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}

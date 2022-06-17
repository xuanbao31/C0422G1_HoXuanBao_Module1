package ss7_Interface_Abtractclass.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println("bán kính trước khi thay đổi: "+circle);
        System.out.println("Diện tích của bán kính trước khi thay đổi :"+circle.getArea());
        circle.resize(5);
        System.out.println("Bán kính sau khi thay đổi:"+circle);
        System.out.println("Diện tích của bán kính sau khi thay đổi: "+circle.getArea());
    }
}

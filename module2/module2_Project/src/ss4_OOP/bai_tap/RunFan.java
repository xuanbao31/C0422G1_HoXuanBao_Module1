package ss4_OOP.bai_tap;


public class RunFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(fan1.FAST);
        System.out.println("fan1");
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println("fan2");
        System.out.println(fan2);
    }
}

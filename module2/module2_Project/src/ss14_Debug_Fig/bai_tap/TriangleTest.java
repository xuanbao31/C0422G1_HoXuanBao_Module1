package ss14_Debug_Fig.bai_tap;

public class TriangleTest {
    private double a;
    private double b;
    private double c;

    public TriangleTest() {

    }

    public TriangleTest(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "TriangleTest{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

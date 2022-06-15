package ss4_OOP.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    double a, b,c;
    public PhuongTrinhBacHai(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
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
    public double getDental(){
        return Math.pow(this.b,2)-(4*this.a*this.c);
    }
    public double getRoot1(){
        return -this.b+(Math.pow(this.b,2)-(4*this.a*this.c))*2*this.a;
    }
    public double getRoot2(){
        return -this.b-(Math.pow(this.b,2)-4*this.a*this.c)*2*this.a;
    }
public void display(){
        if (getDental()>=0){
            System.out.println("Nghiệm 1 :"+this.getRoot1()+" "+"NGhiệm 2: "+this.getRoot2());
        }
}

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        System.out.println("Nhập số b:");
        double b = input.nextDouble();
        System.out.println("Nhập số c");
        double c =input.nextDouble();
        PhuongTrinhBacHai phuongTrinhBacHai=new PhuongTrinhBacHai(a,b,c);
        phuongTrinhBacHai.display();
    }
}

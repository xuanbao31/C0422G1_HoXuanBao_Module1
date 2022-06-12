package ss4_OOP.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
   public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
       return a;
    }
    public double getB(){
       return b;
    }
    public double getC(){
       return c;
    }
   public double getDiscriminant(){
       return Math.pow(this.b,2)-4*this.a*this.c;
   }
   public double getRoot1(){
       return (-this.b+(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
   }
   public double getRoot2(){
       return (-this.b-(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
   }
   public void display(){
       if (this.getDiscriminant()>=0){
           System.out.println("Ngiệm 1: "+this.getRoot1()+"  "+"Nghiệm 2: "+this.getRoot2());
       }
   }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number a");
        double a = input.nextDouble();
        System.out.println("Enter your number b");
        double b = input.nextDouble();
        System.out.println("Enter your number c");
        double c= input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.display();
    }
}

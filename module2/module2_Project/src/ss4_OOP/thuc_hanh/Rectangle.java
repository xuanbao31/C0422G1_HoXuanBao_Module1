package ss4_OOP.thuc_hanh;
import java.util.Scanner;
public class Rectangle {
    double width,height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public  double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return  (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{"+ "width ="+width+","+"height="+height+"}";
    }
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.println("Enter the width: ");
            double width =input.nextDouble();
            System.out.println("Enter the height");
            double height = input.nextDouble();
            Rectangle rectangle=new Rectangle(width,height);
            System.out.println("Your Rectangle "+rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: "+rectangle.getArea());
    }


}

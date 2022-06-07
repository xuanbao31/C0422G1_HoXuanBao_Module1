package ss1_introduction.thuc_hanh;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        System.out.println("Enter your weight");
        System.out.println("Enter your height");
        Scanner scanner=new Scanner(System.in);
        float weight=Float.parseFloat(scanner.nextLine());
        float height=Float.parseFloat(scanner.nextLine());
        float bmi = weight/(height*height);
        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (bmi<=25.0){
            System.out.println("Normal");
        }else if (bmi<30.0){
            System.out.println("OverWeight");
        }else if (bmi>=30.0){
            System.out.println("Obese");
        }
    }
}

package ss3_Mang.thuc_hanh;

import java.util.Scanner;

public class FindTheMaxValueInAnArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the size");
            size= input.nextInt();
            if (size>20);
            System.out.println("Size should not exceed 20");
        }while (size>20);
        int array[]=new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter elment"+(i+1)+" : ");
            array[i]= input.nextInt();
        }
        System.out.println("Property list: ");
        for (int j =0;j<array.length;j++){
            System.out.print(array[j]+",");
        }
            int max =array [0];
        int index =1;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max =array[i];
                index=i;
            }
        }
        System.out.println("giá trị lớn nhất ở trong mảng: "+max+" "+"nam o vi tri"+index);
    }

}


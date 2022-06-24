package ss14.Thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepChen {
//    static double[]myList={11,25,31,1,7,0,88,99};
//
//    public static void sapXep(double[]myList){
//        boolean flag =true;
//        for (int i = 0; i < myList.length&&flag; i++) {
//            flag=false;
//            for (int j = 0; j < myList.length-1; j++) {
//                if (myList[j]>myList[j+1]){
//                    double temp=myList[j];
//                    myList[j]=myList[j+1];
//                    myList[j+1]=temp;
//                    flag=true;
//                }
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        sapXep(myList);
//        System.out.println(Arrays.toString(myList));
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int lenght =Integer.parseInt(scanner.nextLine());
        int[] arr =new int[lenght];
        System.out.println("Nhập "+ arr.length+"phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =Integer.parseInt(scanner.nextLine());
        }
        int index, arrIndex;
        for (int i = 0; i < arr.length; i++) {
            arrIndex =arr[i];
            index =i;
            while (index>0 && arrIndex < arr[index-1]) {
                arr[index]= arr[index-1];
                index--;
            }
            arr[index]=arrIndex;
            System.out.println("Mảng sau khi sắp xếp theo từng bước "+i+"là"+ Arrays.toString(arr));

        }
    }

}

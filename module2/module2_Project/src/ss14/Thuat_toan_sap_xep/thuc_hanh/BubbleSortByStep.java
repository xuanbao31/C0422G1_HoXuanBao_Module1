package ss14.Thuat_toan_sap_xep.thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của list: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size]; //bỏ size vào mảng list
        System.out.println("Nhập " + list.length + "value: "); // phần tử có trong mảng
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("List nhập vào của bạn: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
    }

    public static void BubbleSortByStep(int[] list) {
        boolean flag = true;
        for (int k = 0; k < list.length && flag; k++) {
            flag = false;
            for (int i = 0; i < list.length - k - 1; i++) {
                if (list[i] > list[i + 1]) {
                    //Hoán đổi danh sách [i] với danh sách [i + 1]/
                    System.out.println("đổi" + list[i] + "width" + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    flag = true;
                }
            }
            //Mảng có thể được sắp xếp và không cần chuyển tiếp theo
            if (flag == false) {
                System.out.println("Mảng có thể được sắp xếp và không cần chuyển tiếp");
                break;

            }
            System.out.println("List sau khi đổi " + k + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}





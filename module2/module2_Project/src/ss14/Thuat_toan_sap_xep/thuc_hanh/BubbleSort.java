package ss14.Thuat_toan_sap_xep.thuc_hanh;

import javax.imageio.stream.ImageInputStream;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, -1, 11, 31};

    public static void bubbleSort(int[] list) {
        boolean flag = true;
        for (int i = 0; i < list.length && flag; i++) {
            flag = false;
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j] + "");

        }
    }
}

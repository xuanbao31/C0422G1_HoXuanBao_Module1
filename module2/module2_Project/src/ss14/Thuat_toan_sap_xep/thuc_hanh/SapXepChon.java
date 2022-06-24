package ss14.Thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class SapXepChon {
    static double[] list = {1, 2, 7, 8, 9, 0, 11, 13, 6, 5};

    public static void selection(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) { //giá trị nhỏ nhất
                if (list[j] < list[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) { // hoán đổi;
                double temp = list[indexMin];
                list[indexMin] = list[i];
                list[i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        selection(list);
        System.out.println(Arrays.toString(list));
        //        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]+"");
//        }
    }
}

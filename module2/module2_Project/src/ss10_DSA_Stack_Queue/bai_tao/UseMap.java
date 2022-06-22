package ss10_DSA_Stack_Queue.bai_tao;

import java.util.*;

public class UseMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();
        String[] strings = string.toLowerCase().split(" ");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("")) {  // kiểm tra có trống không
                if (treeMap.containsKey(strings[i])) { //
                    treeMap.put(strings[i], treeMap.get(strings[i]) + 1);
                } else {
                    treeMap.put(strings[i], 1);
                }
            }
        }
//        Set<String> set = treeMap.keySet();
//        for (String s:set) {
//            System.out.println(s+"xuất hiện "+ treeMap.get(s));
//        }
        System.out.println(treeMap);
    }
}

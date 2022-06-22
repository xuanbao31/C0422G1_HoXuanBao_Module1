package ss11_Java_Collection_Framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();//khởi tạo hash map
        hashMap.put("Bảo", 22);
        hashMap.put("Khánh", 22);
        hashMap.put("Minh", 22);
        hashMap.put("Đen", 22);
        hashMap.put("Hào", 22);
        System.out.println("Display entries in HashMap"); //hiển thị ra ds
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);//khởi tạo tree map
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        //Hiển thị  theo thứ tự tăng dần
        Map<String,Integer>linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Bảo bùng binh",31);
        linkedHashMap.put("Khánh khù khờ",11);
        linkedHashMap.put("Hào hài hước",7);
        linkedHashMap.put("Minh mực",21);
        linkedHashMap.put("Đen Sacxo",26);
        System.out.println("\n the age for"+"Bảo is"+linkedHashMap.get("Bảo bùng binh"));

    }

}

package ss11_Java_Collection_Framework.thuc_hanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Student>hashMap=new HashMap<>();
        hashMap.put(1,new Student("bảo",10,"80 Phan Châu Trinh"));
        hashMap.put(3,new Student("bảo 2",11,"80 Phan Châu Trinh"));
        hashMap.put(2,new Student("bảo 3",12,"80 Phan Châu Trinh"));
        hashMap.put(4,new Student("bảo 4",13,"80 Phan Châu Trinh"));
        for(Map.Entry<Integer,Student>student:hashMap.entrySet()){
            System.out.println(student.toString());
        }
        Set<Student>hashSet=new HashSet<>();
        hashSet.add(new Student("bảo",10,"80 Phan Châu Trinh"));
        hashSet.add(new Student("bảo",11,"80 Phan Châu Trinh"));
        hashSet.add(new Student("bảo",12,"80 Phan Châu Trinh"));
        hashSet.add(new Student("bảo",13,"80 Phan Châu Trinh"));
        for (Student student:hashSet){
            System.out.println(student.toString());

        }
    }
}

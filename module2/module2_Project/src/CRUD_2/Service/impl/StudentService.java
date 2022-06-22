package CRUD_2.Service.impl;

import CRUD_2.model.Person;
import CRUD_2.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> arrayList = new ArrayList<>();

    static {
        arrayList.add(new Student("bảo", 2, 11, "Nguyễn Khuyến"));
        arrayList.add(new Student("hưng", 5, 11, "Nguyễn Khuyến"));
        arrayList.add(new Student("danh", 9, 11, "Nguyễn Khuyến"));
        arrayList.add(new Student("bảo 2", 11, 11, "Nguyễn Khuyến"));
    }

    public void display() {
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn thêm ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi muốn thêm");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lớp muốn thêm");
        int classroom = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trường muốn thêm ");
        String school = scanner.nextLine();
        arrayList.add(new Student(name, age, classroom, school));
        for (Student s:arrayList) {
            System.out.println(s);
        }
    }
    public void update(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên muốn cập nhật");
        String name = scanner.nextLine();

    }
}



package ss5_accessmodifier_staticmethod_staticproperty.bai_tap_CRUD;

import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "bảo", "QN", true, "chanhtv");
        students[1] = new Student(2, "phúc", "QN", true, "chanhtv");
        students[2] = new Student(3, "nhiên", "QN", true, "chanhtv");
    }

    // CRUD
    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }

        }
    }

    public void add() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập giới email");
        String email = scanner.nextLine();
        Student student = new Student(id, name, address, gender, email);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        display();
    }

    public void update() {
        System.out.println("Nhập phần tử bạn muốn update");
        int index = scanner.nextInt();

        if (students[index] != null) {

            System.out.println("nhập id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập tên cần ");
            String name = scanner.nextLine();
            System.out.println("nhập địa chỉ");
            String address = scanner.nextLine();
            System.out.println("nhập giới tính");
            boolean gender = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("nhập giới email");
            String email = scanner.nextLine();
            students[index] = new Student(id, name, address, gender, email);
        } else {
            System.out.println("không có phần tử bạn muốn update");
        }
        display();

    }
    public void delete(){
        System.out.println("Nhập phần tử bạn muốn xóa");
        int erase = scanner.nextInt();
        if (students[erase]!=null){

        }
    }

}






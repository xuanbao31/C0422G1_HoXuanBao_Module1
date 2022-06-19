package ssCRUD.service.impl;


import ss5_accessmodifier_staticmethod_staticproperty.bai_tap.stuent.Student;
//import ssCRUD.service.IStudentService;

//import java.util.LinkedList;
//import java.util.Scanner;
//
//
//// triển khai các phương thức trong IStudentService
//public class StudentService implements IStudentService {
//    // tạo danh sách giả lập
//    Scanner scanner = new Scanner(System.in);
//    private static LinkedList<Student> studentList = new LinkedList<>();
//    static {
//       studentList.add(new Student(1,"chanh1","C0422G1",9));
//       studentList.add(new Student(2,"chanh2","C0422G1",6));
//       studentList.add(new Student(3,"chanh1","C0422G1",10));
//    }
//    @Override
//    public void searchByName(String name) {
//
//    }
//
//    @Override
//    public void display() {
//        // dùng foreach duyệt
////         for(Student s: studentList){
////             System.out.println(s);
////         }
//        // dùng for thường duyệt
//         for (int i = 0; i <studentList.size() ; i++) {
//            System.out.println((i+1)+"."+studentList.get(i));
//        }
//    }
//
//    @Override
//    public void add() {
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập tên");
//        String name = scanner.nextLine();
//        System.out.println("nhập lớp");
//        String class1 = scanner.nextLine();
//        System.out.println("nhập điểm");
////        int point = Integer.parseInt(scanner.nextLine());
////        Student student = new Student(id,name,class1,point);
//        // them mới dùng add()
//        studentList.add(student);
//    }
//
//    @Override
//    public void edit() {
//        // hiện thị danh sách để chọn để chọn
//        display();
//        System.out.println("chọn học viên cần sửa");
//        int editId = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
//        // cách 1: sử dụng method set() của arraylist
////        System.out.println("nhập tên");
////        String name = scanner.nextLine();
////        System.out.println("nhập lớp");
////        String class1 = scanner.nextLine();
////        System.out.println("nhập điểm");
////        int point = Integer.parseInt(scanner.nextLine());
////        Student student = new Student(id,name,class1,point);
////        studentList.set(editId-1,student);
//
////         Cách 2: sửa trực tiếp
//        for (int i = 0; i <studentList.size() ; i++) {
//           if (editId-1 ==i){
//               System.out.println("nhập id");
//               studentList.get(i).setId(Integer.parseInt(scanner.nextLine()));
//               System.out.println("nhập tên");
//               studentList.get(i).setName(scanner.nextLine());
//               break;
//           }
//        }
//    }
//
//    @Override
//    public void delete() {
//        display();
//        System.out.println("chọn học viên cần xóa");
//        int deleteId = Integer.parseInt(scanner.nextLine());
//        studentList.remove(deleteId-1);
//    }
//}

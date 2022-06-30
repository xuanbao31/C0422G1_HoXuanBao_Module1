package Case_Study.Service.Impl;

import Case_Study.Model.Employee;
import Case_Study.Service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> arrayList = new ArrayList<>();

    static {
        Employee employee = new Employee("Bảo", 31, "cuncon", 0000, 012345, "Nam", 1, "Xuất sắc", "Bảo vệ", 1000);
        Employee employee1 = new Employee("Phúc", 31, "cuncon", 0000, 012345, "Nam", 2, "Xuất sắc", "Bảo vệ", 1000);
        Employee employee2 = new Employee("Hùng", 31, "cuncon", 0000, 012345, "Nam", 3, "Xuất sắc", "Bảo vệ", 1000);
        arrayList.add(employee);
        arrayList.add(employee1);
        arrayList.add(employee2);

    }

    @Override
    public void add() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập CMND");
        int numberCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập mã nhân viên");
        int codeNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trình độ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí");
        String viTri = scanner.nextLine();
        System.out.println("Nhập lương");
        double luong = Double.parseDouble(scanner.nextLine());
        arrayList.add(new Employee(name, birth, email, numberCMND, numberPhone, gender, codeNhanVien, trinhDo, viTri, luong));

    }

    @Override
    public void edit() {
        do {
            System.out.println("Nhập mã nhân viên ");
            int maNhanVien = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (maNhanVien == arrayList.get(i).getCodeNhanVien()) {
                    check = true;
                    System.out.println("Nhập tên muốn sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập ngày sinh muốn sửa");
                    int day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập email muốn sửa");
                    String email = scanner.nextLine();
                    System.out.println("Nhập số CMND");
                    int numberCMND = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập số điện thoại");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    System.out.println("Giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Trình độ");
                    String trinhDo = scanner.nextLine();
                    System.out.println("Vị trí");
                    String viTri = scanner.nextLine();
                    System.out.println("Nhập Lương");
                    double luong = Double.parseDouble(scanner.nextLine());
                    int id = arrayList.get(i).getCodeNhanVien();
                    arrayList.remove(arrayList.get(i));
                    arrayList.add(new Employee(name, day, email, numberCMND, phoneNumber, gender, id, trinhDo, viTri, luong));
                    return;
                }
            }
            if (check) {
                System.out.println("Nhập lại mã nhân viên ");
            }
        } while (true);


    }

    @Override
    public void display() {
        for (Employee employeeService : arrayList) {
            System.out.println(employeeService);
        }

    }


}


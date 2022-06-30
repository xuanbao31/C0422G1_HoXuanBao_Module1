package Case_Study.Service.Impl;

import Case_Study.Model.Customer;
import Case_Study.Service.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Customer> customerServices = new ArrayList<>();

    static {
        Customer customer = (Customer) new Customer("King", 31, "cuncon", 123456, 586, "Nam", 5555, "vip", "Hung Vuong");
        Customer customer1 = (Customer) new Customer("Bảo", 31, "cuncon", 2002, 586, "Nam", 1111, "vippro", "Hung Vuong");
        Customer customer2 = (Customer) new Customer("Khánh", 11, "cacon", 2004, 179, "Nữ", 7777, "vippro", "Eurovilla");
        Customer customer3 = (Customer) new Customer("Minh", 21, "muccon", 2003, 421, "Nam", 2222, "vippro", "Nguyen Tri Phuong");
        customerServices.add(customer);
        customerServices.add(customer1);
        customerServices.add(customer2);
        customerServices.add(customer3);
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng");
        int code = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerServices.size(); i++) {
            if (code == customerServices.get(i).getMaKhachHang()) {
                check=true;
                System.out.println("Nhập Tên");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Nhập số CMND");
                int numberCMND = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số điện thoại");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính ");
                String gender = scanner.nextLine();
                System.out.println("Nhập loại khách hàng");
                String customerType = scanner.nextLine();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
            }
            if (check){
                System.out.println("Nhập lại Mã Khách Hàng");
            }

        }

    }

    @Override
    public void add() {
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập số CMND");
        int numberCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("Nhập Mã Khách Hàng ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại khách hàng");
        String customerType = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        customerServices.add(new Customer(name, birth, email, numberCMND, phoneNumber, gender, code, customerType, address));


    }

    @Override
    public void display() {
        for (Customer c : customerServices) {
            System.out.println(c);
        }
    }

}

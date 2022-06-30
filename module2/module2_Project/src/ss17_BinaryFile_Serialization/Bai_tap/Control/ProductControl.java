package ss17_BinaryFile_Serialization.Bai_tap.Control;

import ss17_BinaryFile_Serialization.Bai_tap.Service.SupperMarkerService;
import ss17_BinaryFile_Serialization.Bai_tap.SuperMarket;

import java.util.Scanner;

public class ProductControl {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String num;
        SupperMarkerService service=new SupperMarkerService();
        do {
            System.out.println("Chọn chức năng" +
                    "\n 1.Thêm" +
                    "\n 2.Hiển thị" +
                    "\n 3.Tìm theo Tên sản phẩm" +
                    "\n 4.Tìm theo mã sản phẩm"+
                    "\n 7.Exit ");
            num = scanner.nextLine();
            switch (num) {
                case "1":
                    System.out.println("Chức năng thêm");
                  service.add();
                    break;
                case "2":
                    System.out.println("Chức năng Hiển Thị");
                    service.display();
                    break;
                case "3":
                    System.out.println("Chức năng tìm theo tên sản phẩm");
                    service.search();
                    break;
                case "4": System.exit(7);
                default:
                    System.out.println("Nhập lại");
            }
        } while (true);
    }
}

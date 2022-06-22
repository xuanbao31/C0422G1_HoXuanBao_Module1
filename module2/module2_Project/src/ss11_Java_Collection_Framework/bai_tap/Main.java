package ss11_Java_Collection_Framework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chức năng hiển thị danh sách sản phẩm");
        ProductManager productManager=new ProductManager();
        productManager.display();
        System.out.println("Chức năng thêm sản phẩm: ");
        productManager.add();
        System.out.println("Chức năng sửa sản phẩm: ");
        productManager.update();
        System.out.println("Chức năng xóa");
        productManager.delete();
        System.out.println("Chức năng tìm kiếm theo tên");
        productManager.search();
        System.out.println("Chức năng sắp xếp sản phẩm tăng dần theo giá");
        productManager.arrangements();
    }

}

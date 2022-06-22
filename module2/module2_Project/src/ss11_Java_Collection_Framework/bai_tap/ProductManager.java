package ss11_Java_Collection_Framework.bai_tap;

import java.util.*;

public class ProductManager {
    static ArrayList<Product> products = new ArrayList<>();

    static {
        Product product = new Product(1, "iphone", 370);
        Product product1 = new Product(2, "samsung", 370);
        Product product2 = new Product(3, "Xiaomi", 370);
        Product product3 = new Product(4, "Oppo", 370);
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public static void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên điện thoại ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền ");
        int price = Integer.parseInt(scanner.nextLine());
        products.add(new Product(id, name, price));
        display();


    }

    public static void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn cập nhật");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Cập nhật tên điện thoại");
                String name = scanner.nextLine();
                System.out.println("Cập nhật giá tiền");
                int price = Integer.parseInt(scanner.nextLine());
                products.get(i).setId(id);
                products.get(i).setName(name);
                products.get(i).setPrice(price);
                display();
                return;
            }
        }
        System.out.println("không có id bạn cần tìm");
    }


    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn xóa ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                display();
                return;
            }

        }
        System.out.println("Không có id bạn cần tìm");
    }
    public static void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        for (int i=0;i<products.size();i++){
            if (products.get(i).getName().equals(name)){
                System.out.println(products.get(i));
            }
        } System.out.println("Không có tên bạn cần tìm");
    }
    public static void arrangements(){
        Collections.sort(products);
        display();
    }
}




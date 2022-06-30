package ss17_BinaryFile_Serialization.Bai_tap.Service;

import ss17_BinaryFile_Serialization.Bai_tap.Service.Service;
import ss17_BinaryFile_Serialization.Bai_tap.SuperMarket;
import ss17_BinaryFile_Serialization.Bai_tap.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupperMarkerService implements Service {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SuperMarket> superMarkets = new ArrayList<>();
    static final String FILE_PATH="src/ss17_BinaryFile_Serialization/Bai_tap/hxb2.txt";


    @Override
    public void add() {
        List<SuperMarket> superMarkets= WriteAndReadFile.readFromFile(FILE_PATH);
        System.out.println("Nhập mã sản phẩm");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String hanSanPham = scanner.nextLine();
        System.out.println("Nhập giá");
        double gia = scanner.nextDouble();
        superMarkets.add(new SuperMarket(maSanPham, tenSanPham, hanSanPham, gia));
        WriteAndReadFile.writeToFile(FILE_PATH,superMarkets);
    }

    @Override
    public void display() {
        List<SuperMarket> superMarkets=WriteAndReadFile.readFromFile(FILE_PATH);
        for (SuperMarket s : superMarkets) {
            System.out.println(s);
        }
    }

    @Override
    public void search() {
        List<SuperMarket> superMarkets=WriteAndReadFile.readFromFile(FILE_PATH);
        System.out.println("Nhập mã sản Phẩm");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < superMarkets.size(); i++) {
            if (maSanPham == superMarkets.get(i).getMaSanPham()) {
                System.out.println(superMarkets.get(i));
            }
        }
    }
}
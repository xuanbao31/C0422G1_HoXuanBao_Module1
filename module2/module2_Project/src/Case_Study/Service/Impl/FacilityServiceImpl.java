package Case_Study.Service.Impl;

import Case_Study.Model.Facility;
import Case_Study.Model.House;
import Case_Study.Model.Room;
import Case_Study.Model.Villa;
import Case_Study.Service.FacilityService;

import java.util.ArrayList;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Facility> arrayList = new ArrayList<>();

    static {
        arrayList.add(new House("5 sao", 6));
        arrayList.add(new Room("ban chai danh rang"));
        arrayList.add(new Villa("6 sao", 100.7, 6));

    }


    @Override
    public void displayList() {

    }

    @Override
    public void display() {
        for (Facility facility : arrayList) {
            System.out.println(facility);
        }

    }

    @Override
    public void add() {
        do {
            System.out.println("Bạn muốn thêm mới");
            System.out.println("1.Villa");
            System.out.println("2.House");
            System.out.println("3.Room");
            String choose=scanner.nextLine();
            switch (choose) {
                case "1":
                    addVilla();
                    return;
                case "2":
                    addHouse();
                    return;
                case "3":
                    addRoom();
                    return;
                default:
                    System.out.println("Nhập lại số");
                    choose=scanner.nextLine();
            }

        } while (true);

    }

    public void addRoom() {
        System.out.println("Nhập dịch vụ");
        String dichVu = scanner.nextLine();
        Room room = new Room(dichVu);
        arrayList.add(room);
    }

    public void addVilla() {
        System.out.println("Nhập Tiêu Chuẩn Phòng");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        Double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Số tầng");
        Integer soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(tieuChuanPhong, dienTichHoBoi, soTang);
        arrayList.add(villa);
    }

    public void addHouse() {
        System.out.println("Tieu chuẩn phòng");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Số tầng");
        Integer soTang = Integer.parseInt(scanner.nextLine());
        House house = new House(tieuChuanPhong, soTang);
        arrayList.add(house);
    }
    public void edit(){
        System.out.println("Nhập ");
    }
}

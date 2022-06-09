package ss3_Mang.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[]footballplayer={"Ronaldo","Messi","Neymar","Công Phượng","Quang Hải"};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name you want search");
         String name= input.nextLine();
         boolean check=false;
        for (int i = 0; i < footballplayer.length; i++) {
            if (footballplayer[i].equals(name)){
                System.out.println("vị trí của cầu thủ trong danh sách "+name+" là :"+i);
                check=true;
                break;
            }
            
        }
        if (!check){
            System.out.println("không tìm thấy "+name+"trong danh sách");
        }
    }


}

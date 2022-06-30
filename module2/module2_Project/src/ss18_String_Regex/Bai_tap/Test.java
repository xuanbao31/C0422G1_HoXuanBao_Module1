package ss18_String_Regex.Bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String nameClass = scanner.nextLine();
        Validate validate=new Validate();
        boolean check = validate.validate(nameClass);
        System.out.println(check);
    }
}

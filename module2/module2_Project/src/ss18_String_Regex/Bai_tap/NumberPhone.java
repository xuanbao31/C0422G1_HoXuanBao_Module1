package ss18_String_Regex.Bai_tap;

import java.util.Scanner;

public class NumberPhone {
    private static final String NUMBER_REGEX = "^\\(\\d{2}\\)-\\([0]\\d{9}\\)$";

    public NumberPhone() {

    }

    public boolean validate(String regex){
       return regex.matches(NUMBER_REGEX);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập số điện thoại");
        String yourNumberPhone = scanner.nextLine();

        NumberPhone numberPhone=new NumberPhone();
        boolean check = numberPhone.validate(yourNumberPhone);
        System.out.println(check);

    }
}

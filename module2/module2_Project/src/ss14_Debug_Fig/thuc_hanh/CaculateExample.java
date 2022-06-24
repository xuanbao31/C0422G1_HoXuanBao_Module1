package ss14_Debug_Fig.thuc_hanh;

import java.util.Scanner;

public class CaculateExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        boolean check = false;
        do {
            try {
                check=false;
                System.out.println("Hãy nhập x: ");
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println("Hãy nhập y: ");
                int y = Integer.parseInt(scanner.nextLine());

                int a = x + y;
                int b = x - y;
                int c = x * y;
                int d = x / y;
                System.out.println(
                        "bao da nhap dung");
                System.out.println("X+Y= "+ a);
                System.out.println("X-Y= "+b);
                System.out.println("X*Y= "+c);
                System.out.println("X/Y= "+d);

            } catch (NumberFormatException e) {
                System.out.println("không dc nhập chữ");
                check = true;
            } catch (Exception e) {
                System.out.println("không dc nhap so 0");
                check = true;
            }
        } while (check);

    }
}

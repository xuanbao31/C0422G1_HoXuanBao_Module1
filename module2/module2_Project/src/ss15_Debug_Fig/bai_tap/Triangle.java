package ss15_Debug_Fig.bai_tap;

import java.util.Scanner;

public class Triangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TriangleTest triangleTest=null;

        boolean check;
        do {
            try {
                System.out.println("Nhập cạnh a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh c");
                double c = Double.parseDouble(scanner.nextLine());
                triangleTest=new TriangleTest(a,b,c);

                try {
                    if (a + b <= c || a + c <= b || b + c <= a) {
                        throw new TriangleException("Đây không phải là 3 cạnh tam giác\n Please try again");
                    } else {
                        System.out.println("Đây là tam giác");
                        break;
                    }
                } catch (TriangleException e) {
                    e.printStackTrace(); // câu lệnh ném ra tất cả các lỗi
                    check = true;
                }

            } catch (Exception e) {
                e.printStackTrace(); // câu lệnh ném ra tất cả các lỗi
                check = true;
            }
        } while (check);
        System.out.println(triangleTest);
    }
}

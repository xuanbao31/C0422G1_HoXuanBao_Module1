package Case_Study.Controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Chức năng trên menu: " +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            System.out.println("Chọn chức năng ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Menu of Employee Management :" +
                            "\n 1. Display list employees" +
                            "\n 2. Add new employee " +
                            "\n 3. Edit employee " +
                            "\n  4. Return main menu  ");
                case 2:
                    System.out.println("Menu of Facility Management :" +
                            "\n 1. Display list customers " +
                            "\n 2. Add new customer" +
                            "\n 3. Edit customer" +
                            "\n 4. Return main menu");
                case 3:
                    System.out.println("Menu of Facility Managerment: " +
                            "\n 1: Display list facility" +
                            "\n 2: Add new facility" +
                            "\n 3: Display list facility maintenance" +
                            "\n 4: Return main menu");
                case 4:
                    System.out.println("Menu of Booking Manage" +
                            "\n 1: Add new booking" +
                            "\n 2: Display list booking" +
                            "\n 3: Create new contracts" +
                            "\n 4: Display list contracts" +
                            "\n 5: Edit contracts" +
                            "\n 6: Return main menu");
                case 5:
                    System.out.println("Promotion Management" +
                            "\n 1: Display list customer use service" +
                            "\n 2: Display list customer get voucher" +
                            "\n 3: Return main menu");
                case 6:
                    System.out.println("Chương trình kết thúc");


            }

        } while (true);
    }
}

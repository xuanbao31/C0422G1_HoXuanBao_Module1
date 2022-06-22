package CRUD_2.view;

import CRUD_2.Service.impl.StudentService;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        StudentService service=new StudentService();
        Scanner scanner=new Scanner(System.in);
        service.display();
        service.add();
    }
}

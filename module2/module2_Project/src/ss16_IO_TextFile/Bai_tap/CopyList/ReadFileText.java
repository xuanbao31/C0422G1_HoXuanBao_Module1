package ss16_IO_TextFile.Bai_tap.CopyList;

import ss16_IO_TextFile.Thuc_hanh.ReadFileExample;

import java.util.Scanner;

public class ReadFileText {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}

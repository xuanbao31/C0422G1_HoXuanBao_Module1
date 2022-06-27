package ss16_IO_TextFile.Thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static List<Country> readFile(String filePath) {
        List<Country> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new Country(Integer.parseInt(arr[0]), (arr[1]), (arr[2])));
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return list;
    }

    public static void writeFile(String filePath, List<Country> list) {
        try {
            FileWriter fr = new FileWriter(filePath);
            BufferedWriter br = new BufferedWriter(fr);
            for (Country s : list) {
                String s1 = s.getId() + ',' + s.getCode() + ',' + s.getName() + ',';
                br.write(s1);
                br.newLine();
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        list = readFile("src/ss16_IO_TextFile/Thuc_hanh/csv.txt");
        for (Country s : list) {
            System.out.println(s);
        }
        writeFile("src/ss16_IO_TextFile/Thuc_hanh/csv2.txt",list);
    }

}

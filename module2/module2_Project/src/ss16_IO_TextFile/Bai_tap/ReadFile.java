package ss16_IO_TextFile.Bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> ReadFile(String filePath) {
        List<String> copylist = new ArrayList<>();
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                copylist.add(line);
            }
            countNumberChar(copylist);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return copylist;
    }

    public void writeFile(String filePath, int a) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("số kí tự có trong chuỗi" + a);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public int countNumberChar(List<String> list) {
        int a = 0;
        for (String s : list) {
            a += s.length();
        }
        System.out.println(a);
        return a;
    }
}
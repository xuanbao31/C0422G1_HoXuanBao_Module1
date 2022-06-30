package ss16_IO_TextFile.Thuc_hanh;

import ss16_IO_TextFile.Bai_tap.CopyList.ReadFile;
//import ss16_IO_TextFile.Bai_tap.ReadFile;

import java.util.List;

public class RunReadFile {
    public static void main(String[] args) {
       ReadFile readFile=new ReadFile();
        List<String>list= readFile.ReadFile("src/ss16_IO_TextFile/Thuc_hanh/123.txt");
        int numberofString=readFile.countNumberChar(list);
        readFile.writeFile("src/ss16_IO_TextFile/Thuc_hanh/456.txt",numberofString);

    }
}

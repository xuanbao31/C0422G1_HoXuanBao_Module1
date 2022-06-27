package ss16_IO_TextFile.Thuc_hanh;

import java.util.List;

public class run {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> numbers= readAndWriteFile.readFile("src/ss16_IO_TextFile/Thuc_hanh/abc.txt");
        int maxValue= ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("src/ss16_IO_TextFile/Thuc_hanh/number.txt",maxValue);
    }
}

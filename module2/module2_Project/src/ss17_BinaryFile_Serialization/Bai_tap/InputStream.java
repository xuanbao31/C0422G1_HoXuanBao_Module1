package ss17_BinaryFile_Serialization.Bai_tap;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputStream {
    public static void writeToFile(String path, List<SuperMarket> superMarkets) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(superMarkets);
            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SuperMarket> readDataFromFile(String path) {
        List<SuperMarket> superMarkets = new ArrayList<>();
        FileInputStream fos = null;
        ObjectInputStream oos = null;
        try {
            fos = new FileInputStream(path);
            oos = new ObjectInputStream(fos);
            superMarkets = (List<SuperMarket>) oos.readObject();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return superMarkets;

    }

}

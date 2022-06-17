package ss7_Interface_Abtractclass;

public class Main {
    public static void main(String[] args) {
        Chaien chaien=new Chaien("123456");
        chaien.Nobita();
        System.out.println(chaien);

        Xeko xeko=new Xeko();
        xeko.Nobita();
        System.out.println(xeko);
        chaien.Nobita();
        xeko.Nobita();
    }
}

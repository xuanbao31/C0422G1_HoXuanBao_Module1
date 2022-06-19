package ss0_Nhap;

public class Main {
    public static void main(String[] args) {
        Person alex=new Person();
        alex.setName("Alex");
        alex.setAge(21);
        Flour flour=new Flour();
        flour.setSize(78);
        flour.setName("Weed");

        alex.setFlour(flour);
        alex.makeBakery(flour);

    }
}

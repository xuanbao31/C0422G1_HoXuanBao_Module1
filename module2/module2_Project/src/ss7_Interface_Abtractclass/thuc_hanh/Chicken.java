package ss7_Interface_Abtractclass.thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : Ò ó o";
    }

    @Override
    public String howtoEat() {
        return "Gà mổ thóc";
    }
}

package ss7_Interface_Abtractclass.thuc_hanh;

public class Text {
    public static void main(String[] args) {

        Fruit [] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit: fruits){
            System.out.println(fruit.howtoEat());
        }
        Animal[] animals=new Animal[2];
        animals [0]=new Chicken();
        animals [1]= new Tiger();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edibler=(Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }
    }
}

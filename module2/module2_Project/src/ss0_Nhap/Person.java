package ss0_Nhap;

public class Person {
    private String name;
    private int age;
    private Flour flour;

    public String getName() {
        return name;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeBakery(Flour flour) {
        System.out.println("Making a bakery"+flour.getName());
    }

}

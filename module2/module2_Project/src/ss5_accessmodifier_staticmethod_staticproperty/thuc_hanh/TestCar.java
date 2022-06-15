package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh;

public class TestCar {
    public static void main(String[] args) {
        Class car1= new Class("BMW 2","Mazda 3");
        System.out.println(Class.numberOfCars);
        Class car2 = new Class("Lamborghini","Porsche");
        System.out.println(Class.numberOfCars);
        System.out.println(car1.getName()+" "+car2.getName());
        System.out.println(car1.getEngine()+" "+car2.getEngine());
    }
}

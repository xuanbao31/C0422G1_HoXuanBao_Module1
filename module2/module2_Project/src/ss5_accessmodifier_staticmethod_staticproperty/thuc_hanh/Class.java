package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh;

public class Class {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Class (String name,String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}

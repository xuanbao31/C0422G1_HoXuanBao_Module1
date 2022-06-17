package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.stuent;

public class Student {
    private String name;
    private String classes;

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

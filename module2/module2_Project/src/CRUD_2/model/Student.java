package CRUD_2.model;

public class Student extends Person {
    private int classroom;
    private String school;


    public Student(String name, int age, int classroom, String school) {
        super(name, age);
        this.classroom = classroom;
        this.school = school;
    }

    public Student(int classroom, String school) {

        this.classroom = classroom;
        this.school = school;
    }

    public Student() {

    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "classroom=" + classroom +
                ", school='" + school + '\'' +
                '}';
    }
}

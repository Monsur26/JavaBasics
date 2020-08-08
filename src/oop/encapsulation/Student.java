package oop.encapsulation;

public class Student {

    // Encapsulation: Data Hiding from public


    private String name;
    private String address;
    private String courseName;
    private double courseFee;

    public Student() {

    }
    public Student(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name, String address, String courseName) {
        this.name = name;
        this.address = address;
        this.courseName = courseName;
    }

    public Student(String name, String address, String courseName, double courseFee) {
        this.name = name;
        this.address = address;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    // Getter Setter


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

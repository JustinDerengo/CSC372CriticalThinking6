package org.justinski;

public class Student {
    private int rollno;
    private String name;
    private String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "Roll #:" + rollno +
                ", Name:" + name  +
                ", Address:" + address +
                '}';
    }
}

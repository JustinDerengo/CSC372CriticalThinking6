package org.justinski;

public class Student {
    private int rollno;
    private static int nextRollno = 1;
    private String name;
    private String address;

    public Student(String name, String address) {
        this.rollno = nextRollno;
        this.name = name;
        this.address = address;
        nextRollno++;
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
        return "Student{" +
                "Roll no. : " + rollno +
                ", Name: '" + name + '\'' +
                ", Address: '" + address + '\'' +
                '}';
    }
}

package com.capgemini.pack;

public class Student {
    String name;
    int id;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Ram");
        Student s2 = new Student(2,"John");
        Student s3 = new Student(3,"Rana");
        Student s4 = new Student(4,"Deepika");
        Student s5 = new Student(5,"Mirza");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
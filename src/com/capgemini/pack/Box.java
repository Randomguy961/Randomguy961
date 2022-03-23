package com.capgemini.pack;

public class Box {
    private int side; //instance variable
    private String color;
    static int a; //class variable


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        int a; //local variable
        this.side = side;
    }

    public String getColor(String color) {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.setSide(4);
        b.color = "white";
        b.a = 6;

        Box b1 = new Box();
        b1.side = 6;
        b1.color = "red";

        System.out.println("b.side = " + b.getSide());
        System.out.println("b.color = " + b.color);
        System.out.println("=================== below is property of b1 object=============");
        System.out.println("b1.side = " + b1.side);
    }
}
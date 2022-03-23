package com.capgemini.pack;

@FunctionalInterface
interface Lambda{
    void m1(int a);

}

public class LambdaExample {
    public static void main(String[] args) {
        Lambda l = a -> System.out.println("from m1 method");

        //            void m4(){
//                System.out.println("m4");
//            }
        Lambda l1= a -> System.out.println("from m1 method dfsdsfd");

        l.m1(2);
        l1.m1(3);


        Lambda l3 = y-> System.out.println("from m1 method from lambda"+y);
        l3.m1(3);

    }
}

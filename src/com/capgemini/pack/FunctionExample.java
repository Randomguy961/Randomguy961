package com.capgemini.pack;

public class FunctionExample {
    //    access_specifier return_type function_name(){
    //method body
//    }
    static int a;

    static public void method1(){
        FunctionExample obj = new FunctionExample();
        obj.a = 6;

        System.out.println("called from function"+obj.a);
//        a = 8; //non static variable can not access in static method
    }

    public void add(){
        int c = 3+2;
        System.out.println(c);
    }


    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0]+" "+args[1]);
        FunctionExample obj = new FunctionExample();
        obj.method1();
        method1();
        obj.add();

    }
}

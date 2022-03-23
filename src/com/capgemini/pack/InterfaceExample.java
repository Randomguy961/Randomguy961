package com.capgemini.pack;
//All method are public and abstract
interface Dao{
    void m1();
    void m2();
    default void m4(){
        System.out.println("from m4");
    }
    static  void m5(){
        System.out.println("from m5");
    }
}

public class InterfaceExample implements Dao {
    public void m1(){
        System.out.println("from m1");
    }
    public void m2(){
        System.out.println("from m2");
    }
    public void m3(){
        System.out.println("from m3");
    }
    public  void m4(){
        System.out.println("from m4");
    }
    public void m5(){
        System.out.println("from m5");
    }

    public static void main(String[] args) {
        Dao d = new InterfaceExample();
        InterfaceExample i = new InterfaceExample();
        d.m1();
        d.m2();
        i.m3();
        d.m4();
        Dao.m5();
    }

}

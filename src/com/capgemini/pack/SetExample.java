package com.capgemini.pack;

import java.util.*;

public class SetExample {
    static void SetMethod(){
        Set<String> set;
        set = new HashSet<>();
        set.add("harshada");
        set.add("Daksh");
        set.add("Teju");
//        set.add("harshada");
        for(String s: set){
            System.out.println(s);
        }
        Iterator<String> itr =  set.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            System.out.println(s);
        }
    }

    static void TreeSetMethod(){

        Set<String> set = new TreeSet<>();
        set.add("Harshada");
        set.add("Daksh");
        set.add("Teju");
//        set.add("Harshada");
        System.out.println("==================TreeSet====================");
        for(String s: set){
            System.out.println(s);
        }
    }
    static void LikedSetMethod(){
        Set<String> set = new LinkedHashSet<>();
        set.add("Harshada");
        set.add("Daksh");
        set.add("Teju");
//        set.add("Harshada");
        System.out.println("==================TreeSet====================");
        for(String s: set){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        SetMethod();
        TreeSetMethod();
        LikedSetMethod();
    }
}

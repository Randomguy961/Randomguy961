package com.capgemini.pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    static void ListMethod(){
        List<String> li = new ArrayList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void LinkedListMethod(){
        List<String> li = new LinkedList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("Using indexing");
        System.out.println(li.get(0));
        System.out.println("====================linked list===================");
        for(String s:li){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ListMethod();
        LinkedListMethod();
//        PersonListMethod();
    }
}

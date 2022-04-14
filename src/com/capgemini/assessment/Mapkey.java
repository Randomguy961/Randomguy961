package com.capgemini.assessment;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class NameCom implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        return a.compareTo(b);
    }
}
public class Mapkey {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new NameCom());
        map.put("Sai", "CSE");
        map.put("Yogesh","ECE");
        map.put("Bhasuru", "EEE");
        map.forEach((k,v)-> System.out.println(k +" "+v));
    }
}

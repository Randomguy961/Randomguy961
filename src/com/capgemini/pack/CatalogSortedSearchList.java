package com.capgemini.pack;

import java.util.*;

public class CatalogSortedSearchList{
    List<String> list;
    public String catalogListSearcher(String s){
        if(s.isEmpty()||s.isBlank()){
            return "Error";
        }
        for(String e:list){
            if(e.equalsIgnoreCase(s)) {
                return "Found";
            }
        }
        return "Not Found";
    }

    public String catalogListSorter(List<String> l){
        if(l.isEmpty()){
            return "Error";
        }
        return "True";
    }

}

package com.capgemini.pack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamp {
    static void ArrayE(int a[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i:a)
        {
            i=sc.nextInt();
            System.out.println(i);
        }
        System.out.println(Arrays.toString(a));
        for(int i:a)
        {
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        int a[]=new int[5];
        ArrayE(a);

    }
}
